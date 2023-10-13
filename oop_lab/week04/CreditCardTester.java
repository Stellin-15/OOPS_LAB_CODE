import java.util.*;

class CreditCard {
    private String name;
    private String cardNo;
    private boolean enabled;
    private int pin;
    private String expiryMonth;
    private int cardType;
    double creditLimit;

    // constructor
    CreditCard(String nam, String CN, boolean enabled, int pin, String EM, int CT, double CL) {
        name = nam;
        cardNo = CN;
        this.enabled = enabled;
        this.pin = pin;
        expiryMonth = EM;
        cardType = CT;
        creditLimit = CL;
    }

    // getter
    public int getPin() {
        return pin;
    }

    // pin check
    public void check(int p) {
        if (getPin() == p) {
            options();
        } else {
            System.out.println("Entered pin is wrong");
        }
        ;
    }

    // options
    public void options() {
        Scanner stellin = new Scanner(System.in);
        int index = 1;
        while (index != 0) {
            System.out.println("Choose an option: ");
            System.out.println("Display - 1 \nChange pin - 2 \ntransaction - 3\nchange card status - 4\nExit - 5 ");
            int opt = stellin.nextInt();

            switch (opt) {
                case 1:
                    display();
                    break;
                case 2:
                    changePin();
                    break;
                case 3:
                    transact();
                    break;
                case 4:
                    changeStatus();
                    break;
                case 5:
                    index = 0;
                    break;
                default:
                    System.out.println("error!!");
            }
        }

    }

    // display function
    public void display() {

        System.out.println("\nNAME : " + name);
        System.out.println("CARD NUMBER : " + cardNo);
        System.out.println("CARD STATUS : " + enabled);
        System.out.println("DATE OF EXPIRY: " + expiryMonth);
        System.out.println("CARD TYPE: " + cardType);
        System.out.println("LIMIT: " + creditLimit + "\n");

        // To check if pin changed
        System.out.println("pin: " + pin);
    }

    // pin change
    public void changePin() {
        Scanner stellin = new Scanner(System.in);
        System.out.println("Enter old pin: ");
        int old_pin = stellin.nextInt();
        if (getPin() == old_pin) {
            System.out.println("Enter new pin: ");
            int new_pin = stellin.nextInt();

            setPin(new_pin);

        }
    }

    // setter
    public void setPin(int new_pin) {
        pin = new_pin;
        System.out.println("The new pin is: " + new_pin);
    }

    public void transact() {
        Scanner stellin = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn: ");
        double amount = stellin.nextDouble();

        if (enabled) {
            if (amount <= creditLimit) {
                System.out.println("Processing........");
                System.out.println("please wait!!!!");

                // silver
                if (cardType == 1) {
                    double charged_amount = amount - (0.01 * amount);
                    System.out.println("amount " + charged_amount + " processed successfully");
                }
                // gold
                else if (cardType == 2) {
                    double charged_amount = amount - (0.02 * amount);
                    System.out.println("amount " + charged_amount + " processed successfully");
                }
                // platinum
                else if (cardType == 3) {
                    double charged_amount = amount - (0.03 * amount);
                    System.out.println("amount " + charged_amount + " processed successfully");
                }
            } else {
                System.out.println("The amount exceed the credit limit of " + creditLimit);
            }
        } else {
            System.out.println("The card has been blocked or disabled!!!\nkindly contact the bank");
        }

    }

    public void changeStatus() {
        Scanner stellin = new Scanner(System.in);

        System.out.println("To change the status of your card: ");
        System.out.println("  Enable - 1\n  Disable/Block - 2");
        int num = stellin.nextInt();
        if (num == 1) {
            setStatus(true);
        } else if (num == 2) {
            setStatus(false);
        }

    }

    // setter for card status
    public void setStatus(boolean temp) {
        enabled = temp;
        System.out.println("The card status is now: " + temp);
    }
}

public class CreditCardTester {
    public static void main(String args[]) {
        Scanner stellin = new Scanner(System.in);
        CreditCard[] user = new CreditCard[10];

        user[0] = new CreditCard("Stellin John George", "2022a7ps0003u", true, 1111, "12/12/2026", 1, 1000);
        user[1] = new CreditCard("Joe Cijo", "2022a7ps0019u", true, 2222, "12/12/2026", 2, 5000);
        user[2] = new CreditCard("Yusra Hakim ", "2022a7ps0004u", true, 3333, "12/12/2026", 3, 10000);
        
        String[] clients = { "2022a7ps0003u", "2022a7ps0019u", "2022a7ps0004u" };

        System.out.println("Enter the card number: ");
        String CN = stellin.nextLine();
        System.out.println("pin: ");
        int pin = stellin.nextInt();

        // check the which client and send index to the function
        if (CN.equals(clients[0])) {
            user[0].check(pin);

        } else if (CN.equals(clients[1])) {
            user[1].check(pin);

        } else if (CN.equals(clients[2])) {
            user[2].check(pin);

        } else {
            System.out.println("The entered card number is wrong\n");

        }

    }
}

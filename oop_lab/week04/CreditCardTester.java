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
    CreditCard(String nam, String CN, boolean enabled, int PIN, String EM, int CT, double CL) {
        name = nam;
        cardNo = CN;
        this.enabled = enabled;
        pin = PIN;
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
            System.out.println("Entered PIN is wrong");
        }
        ;
    }

    // options
    public void options() {
        Scanner sc = new Scanner(System.in);
        int index = 1;
        while (index != 0) {
            System.out.println("Choose an option: ");
            System.out.println("Display - 1 \nChange pin - 2 \ntransaction - 3\nchange card status - 4\nExit - 5 ");
            int opt = sc.nextInt();

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

        System.out.println("NAME : " + name);
        System.out.println("CARD NUMBER : " + cardNo);
        System.out.println("CARD STATUS : " + enabled);
        System.out.println("DATE OF EXPIRY: " + expiryMonth);
        System.out.println("CARD TYPE: " + cardType);
        System.out.println("LIMIT: " + creditLimit);

        // To check if pin changed
        System.out.println("pin: " + pin);
    }

    // pin change
    public void changePin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter old pin: ");
        int old_pin = sc.nextInt();
        if (getPin() == old_pin) {
            System.out.println("Enter new pin: ");
            int new_pin = sc.nextInt();

            setPin(new_pin);

        }
    }

    // setter
    public void setPin(int new_pin) {
        pin = new_pin;
        System.out.println("The new pin is: " + new_pin);
    }

    public void transact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn: ");
        double amount = sc.nextDouble();

        if (enabled) {
            if (amount <= creditLimit) {
                System.out.println("Processing........");
                System.out.println("please wait!!!!");

                // silver
                if (cardType == 1) {
                    double charged_amount = amount - (0.01 * amount);
                    System.out.println("amount " + charged_amount + " processed sucessfully");
                }
                // gold
                else if (cardType == 2) {
                    double charged_amount = amount - (0.02 * amount);
                    System.out.println("amount " + charged_amount + " processed sucessfully");
                }
                // platinum
                else if (cardType == 3) {
                    double charged_amount = amount - (0.03 * amount);
                    System.out.println("amount " + charged_amount + " processed sucessfully");
                }
            } else {
                System.out.println("The amount exceed the credit limit of " + creditLimit);
            }
        } else {
            System.out.println("The card has been blocked or disabled!!!\nkindly contact the bank");
        }

    }

    public void changeStatus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("To change the status of your card: ");
        System.out.println("  Enable - 1\n  Disable/Block - 2");
        int num = sc.nextInt();
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
        Scanner sc = new Scanner(System.in);
        CreditCard[] p = new CreditCard[10];

        CreditCard p1 = new CreditCard("Stellin John George", "2022a7ps0003u", true, 1111, "12/12/2026", 1, 1000);
        CreditCard p2 = new CreditCard("Joe Cijo", "2022a7ps0019u", true, 2222, "12/12/2026", 2, 5000);
        CreditCard p3 = new CreditCard("BEGAM Yusra Hakim ", "2022a7ps0004u", true, 3333, "12/12/2026", 3, 10000);
        String[] clients = { "2022a7ps0003u", "2022a7ps0019u", "2022a7ps0004u" };

        System.out.println("Enter the card number: ");
        String CN = sc.nextLine();
        System.out.println("PIN: ");
        int PIN = sc.nextInt();

        // check the which client and send index to the function
        if (CN.equals(clients[0])) {
            p1.check(PIN);

        } else if (CN.equals(clients[1])) {
            p2.check(PIN);

        } else if (CN.equals(clients[2])) {
            p3.check(PIN);

        } else {
            System.out.println("The entered card number is wrong ");

        }

    }
}

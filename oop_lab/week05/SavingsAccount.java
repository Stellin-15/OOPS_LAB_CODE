import java.util.*;

class SavingsAccount {
    private double savingsBalance;
    static double annualInterestrate = 0.12;

    SavingsAccount(double currentAmmount) {
        savingsBalance = currentAmmount;

    }

    public void calculateMonthlyInterest() {
        double interest;

        interest = (savingsBalance * annualInterestrate) / 12;
        savingsBalance += interest;
    }

    public void Display(int index) {
        System.out.println("The current balance of the account " + index + " : " + savingsBalance);

    }

    public void modifyInterestRate(double rate) {
        double new_rate;
        new_rate = rate / 100;
        annualInterestrate = new_rate;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of accounts: ");
        int num = sc.nextInt();
        SavingsAccount[] p = new SavingsAccount[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the current amount in the account: ");
            double CA = sc.nextDouble();

            p[i] = new SavingsAccount(CA);

            int j = 1;
            while (j != 0) {
                System.out.println("modify interest rate - 2: \nexit - 1\nnormal interest rate - 3");
                int index = sc.nextInt();
                if (index == 2) {
                    System.out.println("Enter the new interest rate: ");
                    double rate = sc.nextDouble();
                    p[i].modifyInterestRate(rate);

                    p[i].calculateMonthlyInterest();
                    p[i].Display(i + 1);

                } else if (index == 1) {
                    index = 0;
                    break;
                }

                else {
                    p[i].calculateMonthlyInterest();
                    p[i].Display(i + 1);
                }

            }

        }
    }

}
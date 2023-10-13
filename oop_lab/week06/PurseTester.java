import java.util.*;

class Purse {

    private int dirham5 = 0, dirham10 = 0, dirham20 = 0, dirham50 = 0, dirham100 = 0, dirham200 = 0,
            dirham500 = 0, dirham1000;
    private int fils50;

    private int fils25;

    private double total;

    public void addDirham(int amount) {
        int note = amount;

        switch (note) {
            case 5:
                dirham5++;
                break;
            case 10:
                dirham10++;
                break;
            case 20:
                dirham20++;
                break;
            case 50:
                dirham50++;
                break;
            case 100:
                dirham100++;
                break;
            case 200:
                dirham200++;
                break;
            case 500:
                dirham500++;
                break;
            case 1000:
                dirham1000++;
                break;
        }

    }

    public void removeDirham(int amount) {
        int note = amount;

        switch (note) {
            case 5:
                dirham5--;
                break;
            case 10:
                dirham10--;
                break;
            case 20:
                dirham20--;
                break;
            case 50:
                dirham50--;
                break;
            case 100:
                dirham100--;
                break;
            case 200:
                dirham200--;
                break;
            case 500:
                dirham500--;
                break;
            case 1000:
                dirham1000--;
                break;
        }

    }

    public void add25Fils() {

        fils25++;

    }

    public void remove25Fils() {

        fils25--;

    }

    public void add50Fils() {

        fils50++;

    }

    public void remove50Fils() {

        fils50--;

    }

    public void purse() {
        System.out.println("\nThe number of 5 notes: " + dirham5);
        System.out.println("The number of 10 notes: " + dirham10);
        System.out.println("The number of 20 notes: " + dirham20);
        System.out.println("The number of 50 notes: " + dirham50);
        System.out.println("The number of 100 notes: " + dirham100);
        System.out.println("The number of 200 notes: " + dirham200);
        System.out.println("The number of 500 notes: " + dirham500);
        System.out.println("The number of 1000 notes: " + dirham1000);
        System.out.println("The number of 25 fils : " + fils25);
        System.out.println("The number of 50 fils : " + fils50 + "\n");
        total();
    }

    public void total() {
        total = 5 * dirham5 + 10 * dirham10 + 20 * dirham20 + 50 * dirham50 + 100 * dirham100
                + 200 * dirham200 + 500 * dirham500 + 1000 * dirham1000 + 0.25 * fils25 + 0.50 * fils50;
        System.out.println("\nTotal: " + total);
    }

}

class PurseTester {
    public static void main(String args[]) {
        Scanner stellin = new Scanner(System.in);
        Purse p = new Purse();
        int i = 1;
        while (i != 0) {
            System.out.println(
                "\n1 - insert dirham\n2 - add 25 fils\n3 - add 50 fils\n4 - remove dirham\n5 - remove 25 fils\n6 - remove 50 fils\n7 - purse\n8 - total\n0 - exit");
            System.out.print("Enter option: ");
            int opt = stellin.nextInt();

            switch (opt) {
                case 0:
                    i = 0;
                    break;

                case 1:
                System.out.println("\n5\t 10\t 20\t 50\t 100\t 200\t 500\t 1000");
                System.out.print("Enter one of the denomination above: ");
                    int amount = stellin.nextInt();
                    p.addDirham(amount);
                    break;

                case 2:
                    p.add25Fils();
                    break;

                case 3:
                    p.add50Fils();
                    break;

                case 4:
                    System.out.println("\n5\t 10\t 20\t 50\t 100\t 200\t 500\t 1000");
                    System.out.print("Enter one of the denomination above: ");
                    int remove_amount = stellin.nextInt();
                    p.removeDirham(remove_amount);
                    break;

                case 5:
                    p.remove25Fils();
                    break;

                case 6:
                    p.remove50Fils();
                    break;

                case 7:
                    p.purse();
                    break;

                case 8:
                    p.total();
                    break;

            }
        }
    }
}
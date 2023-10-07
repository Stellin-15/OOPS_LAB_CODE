import java.util.*;

class Purse {

    private int dirharm_5 = 0, dirharm_10 = 0, dirharm_20 = 0, dirharm_50 = 0, dirharm_100 = 0, dirharm_200 = 0,
            dirharm_500 = 0, dirharm_1000;
    private int fils_50;

    private int fils_25;

    private double total;

    public void add_dirham(int amount) {
        int note = amount;

        switch (note) {
            case 5:
                dirharm_5++;
                break;
            case 10:
                dirharm_10++;
                break;
            case 20:
                dirharm_20++;
                break;
            case 50:
                dirharm_50++;
                break;
            case 100:
                dirharm_100++;
                break;
            case 200:
                dirharm_200++;
                break;
            case 500:
                dirharm_500++;
                break;
            case 1000:
                dirharm_1000++;
                break;
        }

    }

    public void remove_dirham(int amount) {
        int note = amount;

        switch (note) {
            case 5:
                dirharm_5--;
                break;
            case 10:
                dirharm_10--;
                break;
            case 20:
                dirharm_20--;
                break;
            case 50:
                dirharm_50--;
                break;
            case 100:
                dirharm_100--;
                break;
            case 200:
                dirharm_200--;
                break;
            case 500:
                dirharm_500--;
                break;
            case 1000:
                dirharm_1000--;
                break;
        }

    }

    public void add_25_fils() {

        fils_25++;

    }

    public void remove_25_fils() {

        fils_25--;

    }

    public void add_50_fils() {

        fils_50++;

    }

    public void remove_50_fils() {

        fils_50--;

    }

    public void purse() {
        System.out.println("The number of 5 notes: " + dirharm_5);
        System.out.println("The number of 10 notes: " + dirharm_10);
        System.out.println("The number of 20 notes: " + dirharm_20);
        System.out.println("The number of 50 notes: " + dirharm_50);
        System.out.println("The number of 100 notes: " + dirharm_100);
        System.out.println("The number of 200 notes: " + dirharm_200);
        System.out.println("The number of 500 notes: " + dirharm_500);
        System.out.println("The number of 1000 notes: " + dirharm_1000);
        System.out.println("The number of 25 fils : " + fils_25);
        System.out.println("The number of 50 fils : " + fils_50);

        double total = 5 * dirharm_5 + 10 * dirharm_10 + 20 * dirharm_20 + 50 * dirharm_50 + 100 * dirharm_100
                + 200 * dirharm_200 + 500 * dirharm_500 + 1000 * dirharm_1000 + 0.25 * fils_25 + 0.50 * fils_50;
        System.out.println("Total: " + total);
    }

    public void total() {
        double total = 5 * dirharm_5 + 10 * dirharm_10 + 20 * dirharm_20 + 50 * dirharm_50 + 100 * dirharm_100
                + 200 * dirharm_200 + 500 * dirharm_500 + 1000 * dirharm_1000 + 0.25 * fils_25 + 0.50 * fils_50;
        System.out.println("Total: " + total);
    }

}

class PurseTester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Purse p = new Purse();
        int i = 1;
        while (i != 0) {
            System.out.println("Enter option: ");
            System.out.println(
                    "1 - insert dirharm\n2 - add 25 fils\n3 - add 50 fils\n4 - remove dirham\n5 - remove 25 fils\n6 - remove 50 fils\n7 - purse\n8 - total\n0 - exit");
            int opt = sc.nextInt();

            switch (opt) {
                case 0:
                    i = 0;
                    break;

                case 1:
                    System.out.println("Enter one of the denomination below: ");
                    System.out.println("5 \t 10 \t 20 \t 50 \t 100 \t 200 \t 500 \t 1000");
                    int amount = sc.nextInt();
                    p.add_dirham(amount);
                    break;

                case 2:
                    p.add_25_fils();
                    break;

                case 3:
                    p.add_50_fils();
                    break;

                case 4:
                    System.out.println("Enter one of the denomination below: ");
                    System.out.println("5 \t 10 \t 20 \t 50 \t 100 \t 200 \t 500 \t 1000");
                    int remove_amount = sc.nextInt();
                    p.remove_dirham(remove_amount);
                    break;

                case 5:
                    p.remove_25_fils();
                    break;

                case 6:
                    p.remove_50_fils();
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
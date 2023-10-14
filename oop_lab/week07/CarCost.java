import java.util.*;

class Car {
    String vehicleId;
    float[] cost;
    double total;
    double grandTotal;

    public Car(String vehicleId, float[] cost, double total, double grandTotal) {
        this.vehicleId = vehicleId;
        this.cost = cost;
        this.total = total;
        this.grandTotal = grandTotal;

    }

}

public class CarCost {
    public static double calculateTotal(float[] cost) {
        return (cost[0] + cost[1] + cost[2]);
    }

    public static double calculateGrandTotal(double total) {
        return (total - (total * 0.10));
    }

    public static void display(Car cars[], int num) {

        for (int i = 0; i < num; i++) {
            System.out.println("\nCAR NAME: " + cars[i].vehicleId);
            System.out.println("Base price:" + cars[i].cost[0]);
            System.out.println("Exercise duty:" + cars[i].cost[1]);
            System.out.println("Sales tax:" + cars[i].cost[2]);
            System.out.println("total: " + cars[i].total);
            System.out.println("Grand total: " + cars[i].grandTotal + "\n");
        }
    }

    public static void displayHighestTotal(Car cars[], int num) {
        Car max = cars[0];

        for (int i = 0; i < num; i++) {
            if (max.grandTotal < cars[i].grandTotal) {
                max = cars[i];

            }

        }
        System.out.println("\nThe most expensive car: ");
        System.out.println("CAR NAME: " + max.vehicleId);
        System.out.println("Base price:" + max.cost[0]);
        System.out.println("Exercise duty:" + max.cost[1]);
        System.out.println("Sales tax:" + max.cost[2]);
        System.out.println("total: " + max.total);
        System.out.println("Grand total: " + max.grandTotal + "\n");

    }

    public static void main(String args[]) {
        Scanner stellin = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int num = stellin.nextInt();

        Car[] cars = new Car[num];
        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter the name of the car: ");
            stellin.nextLine();
            String carName = stellin.nextLine();

            float[] cost = new float[3];

            System.out.print("Enter the base price: ");
            cost[0] = stellin.nextFloat(); // base
            System.out.print("Enter the exercise duty: ");
            cost[1] = stellin.nextFloat(); // exercise
            System.out.print("Enter the Sales tax: ");
            cost[2] = stellin.nextFloat(); // sales tax

            double total = calculateTotal(cost);
            double grandTotal = calculateGrandTotal(total);
            cars[i] = new Car(carName, cost, total, grandTotal);

        }

        display(cars, num);
        displayHighestTotal(cars, num);

    }
}

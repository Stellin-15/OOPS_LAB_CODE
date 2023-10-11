import java.util.*;

class Car {
    String Vehicle_id;
    float[] cost = new float[3];
    float Total;
    double Grand_total;

    Car(String Vehicle_id, float[] cost, float Total, double Grand_total) {
        this.Vehicle_id = Vehicle_id;
        this.cost = cost;
        this.Total = Total;
        this.Grand_total = Grand_total;
    }

}

public class CarCost {

    public static float CalcualteTotal(float cost[]) {
        float total_cost = cost[0] + cost[1] + cost[2];
        return total_cost;
    }

    public static double CalculateGrandTotal(float cost[], float total) {
        double Calculate_Grand_Total = cost[0] + cost[1] + cost[2] - (total * 0.10);
        return Calculate_Grand_Total;
    }

    public static void display(int num, Car cars[]) {

        for (int i = 0; i < num; i++) {
            System.out.println("CAR NAME: " + cars[i].Vehicle_id);
            System.out.println("Base price:" + cars[i].cost[0]);
            System.out.println("Exercise duty:" + cars[i].cost[1]);
            System.out.println("Sales tax:" + cars[i].cost[2]);
            System.out.println("Total: " + cars[i].Total);
            System.out.println("Grand Total: " + cars[i].Grand_total);
        }
    }

    public static void highest_total_display(Car cars[], int num) {
        double max = cars[0].Grand_total;
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (max < cars[i].Grand_total) {
                double temp = cars[i].Grand_total;
                cars[i].Grand_total = max;
                max = temp;
                index = i;

            }
        }
        System.out.println("The most expensive car: ");
        System.out.println("CAR NAME: " + cars[index].Vehicle_id);
        System.out.println("Base price:" + cars[index].cost[0]);
        System.out.println("Exercise duty:" + cars[index].cost[1]);
        System.out.println("Sales tax:" + cars[index].cost[2]);
        System.out.println("Total: " + cars[index].Total);
        System.out.println("Grand Total: " + cars[index].Grand_total);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int num = sc.nextInt();

        Car[] cars = new Car[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the name of the car: ");
            sc.nextLine();
            String CarName = sc.nextLine();

            float[] cost = new float[3];

            System.out.print("Enter the base price:");
            cost[0] = sc.nextFloat();
            System.out.print("Enter the exercise duty:");
            cost[1] = sc.nextFloat();
            System.out.print("Enter the Sales tax:");
            cost[2] = sc.nextFloat();

            float total = CalcualteTotal(cost);
            double grand_total = CalculateGrandTotal(cost, total);

            cars[i] = new Car(CarName, cost, total, grand_total);

        }

        display(num, cars);
        highest_total_display(cars, num);

    }

}

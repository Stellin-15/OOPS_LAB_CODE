import java.util.*;

class Sorting {

    public static void max(float[] arr) {
        float max = arr[0];

        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                float temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("The max value is: " + max);
        System.out.println("The minimum value is: " + arr[0]);

    }

    public static void avg(float[] arr) {
        float sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = arr[i] + sum;
        }
        float avg = sum / 10;
        System.out.println("The avarage is: " + avg);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[10];

        System.out.println("Enter the float values: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the value " + (i + 1) + " :");
            arr[i] = sc.nextFloat();
        }

        max(arr);

        avg(arr);
    }
}
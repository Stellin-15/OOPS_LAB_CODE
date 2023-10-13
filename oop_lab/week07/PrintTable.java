import java.util.*;

public class PrintTable {

    public static void printTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");

            }
            System.out.println();

        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        printTable(num);

    }

}

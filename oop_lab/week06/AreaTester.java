import java.util.*;
import java.text.*;

class Area {

    public static final DecimalFormat df = new DecimalFormat("0.000");

    public void calc_area(int s_square) {
        double area = 0;
        area = s_square * s_square;
        display(area);
    }

    public void calc_area(float r) {
        float radius = r;
        double area = 3.14 * r * r;
        display(area);
    }

    public void calc_area(float l, float b) {
        double area = l * b;
        display(area);
    }

    public void display(double area) {

        System.out.println("The area is: " + df.format(area));
    }

}

public class AreaTester {

    public static void main(String args[]) {
        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape: ");
        System.out.println("Square - 1 \nCircle - 2\nRectangle - 3\nexit - 4");
        int n = sc.nextInt();

        Area a = new Area();

        switch (n) {
            case 1:
                System.out.println("Enter the side  of the square: ");
                int s_square = sc.nextInt();
                a.calc_area(s_square);
                break;

            case 2:
                System.out.println("Enter the radius of circle: ");
                float r = sc.nextFloat();
                a.calc_area(r);
                break;

            case 3:
                System.out.println("Enter the length of rectangle: ");
                float l = sc.nextFloat();
                System.out.println("Enter the breath of rectangle: ");
                float b = sc.nextFloat();
                a.calc_area(l, b);
                break;

        }

    }
}
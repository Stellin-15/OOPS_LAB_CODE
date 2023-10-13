import java.util.*;
import java.text.*;

class Area {

    public static final DecimalFormat df = new DecimalFormat("0.000");

    public void calcArea(int sideSquare) {
        double area = sideSquare * sideSquare;
        display(area);
    }

    public void calcArea(float r) {
        double area = 3.14 * r * r;
        display(area);
    }

    public void calcArea(float l, float b) {
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

        Scanner stellin = new Scanner(System.in);

        System.out.println("Square - 1 \nCircle - 2\nRectangle - 3\nexit - 4");
        System.out.print("Enter the shape: ");
        int option = stellin.nextInt();

        Area a = new Area();

        switch (option) {
            case 1:
                System.out.print("Enter the side  of the square: ");
                int sideSquare = stellin.nextInt();
                a.calcArea(sideSquare);
                break;

            case 2:
                System.out.print("Enter the radius of circle: ");
                float r = stellin.nextFloat();
                a.calcArea(r);
                break;

            case 3:
                System.out.print("Enter the length of rectangle: ");
                float l = stellin.nextFloat();
                System.out.print("Enter the breath of rectangle: ");
                float b = stellin.nextFloat();
                a.calcArea(l, b);
                break;

        }

    }

}

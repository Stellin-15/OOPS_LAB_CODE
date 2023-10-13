import java.util.*;

public class Elements {
    int atomicNumber;
    String nameElement;
    String symbolElement;
    String clas;
    double atomicWeight;

    Elements(int an, String name, String sym, String clas, double aw) // constructor
    {
        atomicNumber = an;
        nameElement = name;
        symbolElement = sym;
        this.clas = clas;
        atomicWeight = aw;
    }

    public void display() {
        System.out.println("\nAtomic number: " + atomicNumber);
        System.out.println("Element name: " + nameElement);
        System.out.println("Chemical Symbol: " + symbolElement);
        System.out.println("Class: " + clas);
        System.out.println("Atomic: " + atomicWeight + "\n");
    }

    public void AW_above15() {
        if (atomicNumber > 15) {
            display();
        }
    }

    public static void main(String args[]) {
        Scanner stellin = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = stellin.nextInt();

        Elements pt[] = new Elements[num];

        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter the atomic number of the element: ");
            int AN = stellin.nextInt();
            stellin.nextLine();

            System.out.print("Enter the name of the element: ");
            String name = stellin.nextLine();

            System.out.print("Enter the chemical symbol of the element: ");
            String sym = stellin.nextLine();

            System.out.print("Enter the class of the element: ");
            String clas = stellin.nextLine();

            System.out.print("Enter the atomic weight of the element: ");
            double AW = stellin.nextDouble();

            pt[i] = new Elements(AN, name, sym, clas, AW);
        }

        for (int i = 0; i < num; i++) {
            pt[i].display();
            System.out.println();
        }

        System.out.println("\nThe elements above the atomic number 15: ");
        for (int i = 0; i < num; i++) {
            pt[i].AW_above15();
            System.out.println();
        }

    }

}

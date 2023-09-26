import java.util.*;

public class Elements {
    int atomic_number;
    String name_element;
    String Symbol_element;
    String Clas;
    double atomic_weight;

    Elements(int AN, String name, String sym, String clas, double AW) // constructor
    {
        atomic_number = AN;
        name_element = name;
        Symbol_element = sym;
        Clas = clas;
        atomic_weight = AW;
    }

    public void display() {
        System.out.println("Atomic number: " + atomic_number);
        System.out.println("Element name: " + name_element);
        System.out.println("Chemical Symbol: " + Symbol_element);
        System.out.println("Class: " + Clas);
        System.out.println("Atomic: " + atomic_weight);
    }

    public void AW_above15() {
        if (atomic_number > 15) {
            display();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        Elements pt[] = new Elements[num];

        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter the atomic number of the element: ");
            int AN = sc.nextInt(); sc.nextLine();

            System.out.print("Enter the name of the element: ");
            String name = sc.nextLine();

            System.out.print("Enter the chemical symbol of the element: ");
            String sym = sc.nextLine();

            System.out.print("Enter the class of the element: ");
            String clas = sc.nextLine();

            System.out.print("Enter the atomic weight of the element: ");
            double AW = sc.nextDouble();

            pt[i] = new Elements(AN, name, sym, clas, AW);
        }

        for (int i = 0; i < num; i++) {
            pt[i].display();
            System.out.println();
        }

        System.out.println("The elements above the atomic number 15: ");
        for (int i = 0; i < num; i++) {
            pt[i].AW_above15();
            System.out.println();
        }

    }

}

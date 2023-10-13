import java.util.*;

class Employee {
    private String ID;
    private String name;
    private int department;
    private double basic;
    private double allowance;
    private double totalSalary;

    // constructor
    Employee(String id, String Name, int dept, double base) {

        ID = id;
        name = Name;
        department = dept;
        basic = base;

    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void display() {

        System.out.println("employee id: " + ID);
        System.out.println("name: " + name);
        System.out.println("department: " + department);
        System.out.println("base salary: " + basic);
        System.out.println("allowance: " + allowance);
        System.out.println("total base salary: " + totalSalary);

    }

    public void salaryCalculator(double base, int dept) {

        double HRA = 0.4 * base;

        if (dept == 1) {
            allowance = 1500;
        } else if (dept == 2) {
            allowance = 2500;
        } else if (dept == 3) {
            allowance = 3500;
        }

        totalSalary = base + allowance + HRA;

    }

}

public class SalaryDetails {
    public static void main(String args[]) {
        Scanner stellin = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int n = stellin.nextInt();
        Employee[] e = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Click 1 for new Employee ");
            int opt = stellin.nextInt();
            stellin.nextLine();
            if (opt == 1) {
                System.out.println("Enter employee id: ");
                String id = stellin.nextLine();
                System.out.println("Enter name: ");
                String Name = stellin.nextLine();
                System.out.println("Enter employee department:  \n  staff - 1\n  accounts - 2\n  admin - 3");
                int dept = stellin.nextInt();
                System.out.println("Enter base salary: ");
                float base = stellin.nextFloat();

                e[i] = new Employee(id, Name, dept, base);
                e[i].salaryCalculator(base, dept);

                e[i].display();
            } else {
                break;
            }

        }
    }
}

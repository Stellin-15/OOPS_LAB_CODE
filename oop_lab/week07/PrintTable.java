import java.util.*;

public class PrintTable {

    public static void print_table(int num)
    {
        for(int i = 1;i<=5;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print(i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
    
        print_table(num);
    
    
    
    }
    
}

import java.util.*;

public class Duplicate_numbers{

    public static int[] duplicate_number(int arr[],int num)
    {
        int count=0;
        int []dupli_num=new int[num];

        for(int i=0;i<num;i++)
        {
        count =0;
            for(int j=0;j<num;j++)

            {
            
                if(i==arr[j])
                {
                    count++;
                }
               

            }
             dupli_num[i]=count;
            
             
        }
        return dupli_num;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();
        
        int []arr = new int[num];

        for(int i=0;i<num;i++){
        System.out.println("Enter the elements: ");
        arr[i]=sc.nextInt();
        }
        

        int Dupli_array_count[] = new int[num];
        Dupli_array_count= duplicate_number(arr,num);


        for (int i = 0; i<num; i++){
         System.out.println("The number of " + i + " is " + Dupli_array_count[i]);
        }


    }
}
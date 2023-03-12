//Program to input 5 numbers from keyboard and find their sum and average. 
import java.util.*;
public class sumavg {
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for(int i=1;i<=5;i++)
        {
            int num=sc.nextInt();
            sum+=num;
        }
        
        double avg=sum/5;
        System.out.println("The sum of the five numbers is: "+sum);
        System.out.println("The average of the five numbers is: "+avg);

        sc.close();

    }
}

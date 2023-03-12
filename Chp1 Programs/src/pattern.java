//Program in Java to display the pattern like right angle triangle with a number. 

import java.util.*;

public class pattern {
    public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

//Program that reads in two floating-point numbers and tests whether they are the same up to three decimal places. 

import java.util.Scanner;
import java.text.DecimalFormat;

public class decimal {
    public static void main(String[] args) 
    {
        System.out.println("Enter a floating point number: ");
        Scanner sc= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.###");
        double a =sc.nextDouble();
        System.out.println("Enter another floating point number: ");
        double b=sc.nextDouble();
        String num1=df.format(a);
        String num2=df.format(b);

        if (num1.equals(num2))
        {
            System.out.println("The numbers are same up to three decimal places");
        }
        else
        {
            System.out.println("The numbers are not the same up to three decimal places");
        }
        sc.close();
    }
    
}

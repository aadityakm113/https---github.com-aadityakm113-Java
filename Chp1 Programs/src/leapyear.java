//Program that takes a year from user and print whether that year is a leap year or not. 
import java.util.*;
public class leapyear {
    public static void main(String[] args)
    {
        System.out.println("Enter a year: ");
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();

        boolean leap=false;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    leap=true;
                else
                    leap=false;
            }
            else
                leap=true;
        }
        else
            leap=false;

        if(leap==true)
        {
            System.out.println(year+" is a lear year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
        sc.close();

    }
    
    
}

/*Design a class to overload a method compare() to return the greater of two as follows: 
void compare(int, int)
void compare(char, char) 
void compare(String, String) */

import java.util.*;
public class compare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integer numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Enter two characters:");
        char c=sc.next().charAt(0);
        char d=sc.next().charAt(0);

        System.out.println("Enter two Strings:");
        String e=sc.next();
        String f=sc.next();


        greater(a, b);
        greater(c, d);
        greater(e, f);

        sc.close();
    }

    static void greater(int a,int b)
    {
        System.out.println("The greater number is: "+Integer.max(a, b));
    }

    static void greater(char c, char d)
    {
        if (c>d)
        {
            System.out.println("The greater character is: "+c);
        }
        else
        {
            System.out.println("The greater character is: "+d);
        }
    }

    static void greater(String e, String f)
    {
        if (e.compareTo(f)>0)
        {
            System.out.println("The greater string is: "+e);
        }
        else
        {
            System.out.println("The greater string is: "+f);
        }
    }
    
}

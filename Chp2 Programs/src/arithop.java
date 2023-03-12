//Program to read two numbers and perform the arithmetic operations using methods.

import java.util.*;
public class arithop{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        System.out.println("Enter the operation you want to perform.\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        int op=sc.nextInt();

        switch(op)
        {
            case 1:
                System.out.println(add(n1,n2));
                break;
            case 2:
                System.out.println(sub(n1,n2));
                break;
            case 3:
                System.out.println(mult(n1,n2));
                break;
            case 4:
                System.out.println(divide(n1,n2));
                break;
            
        }
        sc.close();
    }

    public static int add(int a,int b)
    {
        return a+b;
    }

    public static int sub(int a,int b)
    {
        return a-b;
    }

    public static int mult(int a,int b)
    {
        return a*b;
    }

    public static float divide(int a,int b)
    {
        return a/b;
    }
}

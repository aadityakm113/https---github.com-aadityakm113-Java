import java.util.Scanner;

class fib
{
    int a=0;
    int b=1;
    int c;

    fib(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    void display(int x)
    {
        System.out.print(a+" "+b);
        for(int i=2;i<x;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of terms");
        int num=sc.nextInt();
        fib obj=new fib(0,1);
        obj.display(num);
        sc.close();
    }
    
}

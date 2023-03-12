import java.util.Scanner;

public class posinega {
    public static void main(String[] args)
    {
        System.out.print("Enter your number: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0)
        {
            System.out.println("Your number is positive");
        }
        else if(num<0)
        {
            System.out.println("your number is negative");
        }
        else
        {
            System.out.println("Your number is zero");
        }
        sc.close();
    }
}

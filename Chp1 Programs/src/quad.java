import java.util.Scanner;

public class quad {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();
        double disc=(b*b)-4*a*c;
        double x1=-b+Math.sqrt(disc)/(2*a);
        double x2=-b-Math.sqrt(disc)/(2*a);
        if (disc>0)
        {
            System.out.println("The roots are: "+x1+" and "+x2);
        }
        else if(disc==0)
        {
            double x= -b / (2 * a);
            System.out.println("The roots are: "+x);
        }
        else
        {
            System.out.println("The equation does not have any real roots");
        }
        
        sc.close();
        
    }
    
}

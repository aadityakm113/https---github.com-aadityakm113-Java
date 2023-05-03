package ch4programs;
import java.util.Scanner;

class Point
{
    double x,y;

    Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
}

public class distance 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y coordinates for the first point: ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();

        System.out.println("Enter x and y coordinates for the second point: ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();

        Point p1=new Point(x1, y1);
        Point p2=new Point(x2, y2);
         
        double xdiff=p2.getX()-p1.getX();
        double ydiff=p2.getY()-p1.getY();
        double dist=Math.sqrt(Math.pow(xdiff, 2)-Math.pow(ydiff, 2));

        System.out.println("The distance between the two points is: "+dist);

        sc.close();
    }
}

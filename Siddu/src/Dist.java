class Point
{
    double a,b;

    Point(double a, double b)
    {
        this.a=a;
        this.b=b;
    }

    double getX()
    {
        return a;
    }
    double getY()
    {
        return b;
    }
}

public class Dist
{
    public static void main(String[] args)
    {
        double x1=9.00;
        double y1=4.00;

        double x2=12.00;
        double y2=6.00;

        Point p1=new Point(x1, y1);
        Point p2=new Point(x2, y2);

        System.out.println("The given points are: ("+p1.getX()+","+p1.getY()+") and ("+p2.getX()+","+p2.getY()+")");
         
        double xdiff=p2.getX()-p1.getX();
        double ydiff=p2.getY()-p1.getY();
        double dist=Math.sqrt(Math.pow(xdiff, 2)-Math.pow(ydiff, 2));

        System.out.println("The distance between the two points is: "+dist);
    }
}

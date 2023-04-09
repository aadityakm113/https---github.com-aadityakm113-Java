import java.util.Scanner;

class Shape
{
    float l,b,h;
    Shape(float l,float b,float h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }

    Shape(int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }

    float calculate()
    {
        return l*b*h;
    }
}

class Test1 extends Shape
{
    Test1(float l,float b,float h)
    {
        super(l,b,h);
    }

    Test1(int l,int b,int h)
    {
        super(l,b,h);
    }
}


public class volume 
{
 public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the length breadth and height of your shape: ");
    int l= sc.nextInt();
    int b= sc.nextInt();
    int h= sc.nextInt();

    Test1 test= new Test1(l, b, h);
    System.out.println("The volume of the shape is: "+test.calculate()); 

    sc.close();
 }
}

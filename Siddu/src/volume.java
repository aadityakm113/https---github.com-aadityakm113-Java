class Shape
{
    float length,breadth,height;
    Shape(float length,float breadth,float height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    Shape(int length,int breadth,int height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    float calculate()
    {
        return length*breadth*height;
    }
}

class Test1 extends Shape
{
    Test1(float length,float breadth,float height)
    {
        super(length,breadth,height);
    }

    Test1(int length,int breadth,int height)
    {
        super(length,breadth,height);
    }
}


public class volume 
{
 public static void main(String[] args)
 {
   

    Test1 test= new Test1(3, 42, 5);
    System.out.println("The volume of the shape is: "+test.calculate()); 

 }
}

package ch4programs;
class Shape
{
    void printshape()
    {
        System.out.println("This is This is shape");
    }
}

class Rectangle extends Shape
{
    void printrec()
    {
        System.out.println("This I rectangular shape");
    }
}

class Circle extends Shape
{
    void printcirc()
    {
        System.out.println("This is circular shape");
    }
} 
class Square extends Rectangle
{
    void printsquare()
    {
        System.out.println("Square is a rectangle");
    }
}
public class shapes 
{
    public static void main(String[] args)
    {
        Square sq= new Square();

        sq.printsquare();
        sq.printrec();
        sq.printshape();
    }
}

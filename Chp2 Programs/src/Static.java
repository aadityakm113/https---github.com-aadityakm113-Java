//Differentiate between static and non-static methods in java.

public class Static {
    void print()
    {
        System.out.println("This is a non static method can be overridden,but not called without an object reference");

    }
    void print(int a)
    {
        System.out.println("This method overrides print: "+a);
    }
    public static void sprint()
    {
        System.out.println("This is a static method can be called without an object");
    }
    public static void sprint(int a)
    {
        System.out.println("Static methods can be overriden as well: "+a);
    }
    public static void main(String[] args) 
    {
        Static s = new Static();
        s.print();
        s.print(5);
        sprint();
        sprint(5);

    }
    
}

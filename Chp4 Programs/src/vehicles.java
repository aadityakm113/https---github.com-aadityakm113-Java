import java.util.Scanner;

abstract class Vehicle
{
    abstract void accelerate();

    abstract void brake();

    abstract void wheels();
}

class Car extends Vehicle
{
    void accelerate()
    {
        System.out.println("Drive slowly");
    }

    void brake()
    {
        System.out.println("Be careful");
    }

    void wheels()
    {
        System.out.println("Car has 4 wheels");
    }
}

class Bike extends Vehicle
{
    void accelerate()
    {
        System.out.println("Drive slowly");
    }

    void brake()
    {
        System.out.println("Be careful");
    }

    void wheels()
    {
        System.out.println("Bike has 2 wheels");
    }
}
class Auto extends Vehicle
{
    void accelerate()
    {
        System.out.println("Drive slowly");
    }

    void brake()
    {
        System.out.println("Be careful");
    }

    void wheels()
    {
        System.out.println("Auto has 3 wheels");
    }
}
public class vehicles {
    public static void main(String[] args)
    {
        Car a=  new Car();
        Bike b= new Bike();
        Auto c= new Auto();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for car 2 for bike and 3 for auto.");
        int x=sc.nextInt();
        if(x==1)
        {
            a.accelerate();
            a.brake();
            a.wheels();
        }

        else if(x==2)
        {
            b.accelerate();
            b.brake();
            b.wheels();
        }

        else if(x==3)
        {
            c.accelerate();
            c.brake();
            c.wheels();
        }

        sc.close();
    }
    
}

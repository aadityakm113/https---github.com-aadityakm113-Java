package ch4programs;
class Parent
{
    void printParent()
    {
        System.out.println("This is parent class");
    }
}
class Child extends Parent
{
    void printChild()
    {
        System.out.println("This is child class");
    }
}
public class parentchild 
{
    public static void main(String[] args)
    {
        Parent p=new Parent();
        Child c =new Child();

        p.printParent();
        c.printChild();
        c.printParent();
    }
}

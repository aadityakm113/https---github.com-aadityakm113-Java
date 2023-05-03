package pkg2;

import pkg1.ClassA;

public class ClassC extends ClassA 
{
    public static void main(String args[])
    {
		ClassA.StaticA();
		ClassA a = new ClassA();
		a.publicA();
		
	}
}

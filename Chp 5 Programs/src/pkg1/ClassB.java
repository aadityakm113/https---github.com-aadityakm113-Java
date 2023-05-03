package pkg1;

public class ClassB {
    public static void main(String args[]){
		
		ClassA.StaticA();
		ClassA a = new ClassA();
		a.publicA();
		a.DefaultA();
		a.protectedA();
		System.out.println(a.num);
    }
}

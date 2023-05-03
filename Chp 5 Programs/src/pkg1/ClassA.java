package pkg1;

public class ClassA {
    protected int num = 10;
	public static void StaticA() {
		System.out.print("This is a public static method in class A");
	}
	public void publicA() {
		System.out.print("This is a public  method in class A");
	}
	void DefaultA() {
		System.out.print("This is a default method in class A");
	}
	private void privateA() {
		System.out.print("This is a private method in class A");
	}
	protected void protectedA() {
		System.out.print("This is a protected method in class A");
	}
	public static void main(String args[]){
		ClassA a = new ClassA();
		a.privateA();
	}
}

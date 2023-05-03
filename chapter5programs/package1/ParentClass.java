package package1;
public class ParentClass {
public int a=10;
int b=20;
	public void sum() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		ParentClass pc = new ParentClass();
		pc.sum();
	}
}

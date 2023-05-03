package package2;
import package1.ParentClass;
public class SubClass extends ParentClass{

	public void show() {
		System.out.println(a);
	}
	public static    void main(String[] args) {
	
		SubClass sc= new SubClass();
		sc.sum();
		sc.show();		
	}

}

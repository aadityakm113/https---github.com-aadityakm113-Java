package pack2;
import java.util.*;
import pack1.Polygon;
import pack3.EquiException;;

public class Triangle implements Polygon{
    int s1,s2,s3;
	int b,h;

	public float area(int b, int h) {
		return (float) (0.5*b*h);
	}
	
	public static void main(String args[]) {
		Triangle t = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the triangle's side: ");
		t.s1 = sc.nextInt();
		t.s2 = sc.nextInt();
		t.s3 = sc.nextInt();
		System.out.println("Enter the height of the triangle: ");
		t.h = sc.nextInt();
		System.out.println("Enter the base of the triangle: ");
		t.b = sc.nextInt();
		
		EquiException.checkEQ(t.s1,t.s2,t.s3);
		
		System.out.println(t.area(10,15));
        sc.close();
	}
    
}

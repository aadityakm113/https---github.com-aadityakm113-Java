package Quad2;
import java.util.*;
import Quad1.*;

public class CalcRoots implements QuadRoots {
    public void calculateRoots(float d, int a, int b){
        double r1,r2;
        if(d>0){
            r1 = (-b+Math.pow(d, 0.5))/2*a;
            r2 = (-b-Math.pow(d, 0.5))/2*a;
            System.out.println("Roots are:" + r1 +","+r2 );
        }
        else if(d==0){
            r1 = (-b+Math.pow(d, 0.5))/2*a;
            System.out.println("Root is:" + r1);
        }
        else{
            System.out.println("No solution");
        }
    }
	
	float deter(int a, int b, int c){
        return calculateDeterminant(a, b, c);
    }

    public static void main(String[] args) {
        int a,b,c;
        float determinant;

        CalcRoots q = new CalcRoots();

        System.out.println("Enter the coefficients of the equation: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        determinant = q.deter(a, b, c);
        q.calculateRoots(determinant, a, b);
        sc.close();
    }
}

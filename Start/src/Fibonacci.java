import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num=sc.nextInt();
        int x=0,y=1,z;
        System.out.print(x+ " "+y);

        for (int i=2;i<num;i++) {
            z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
        sc.close();
    }
}
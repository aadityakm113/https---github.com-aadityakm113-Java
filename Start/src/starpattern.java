import java.util.Scanner;

public class starpattern {
    public static void main(String[] args) {
        
        int i,j,rows;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no.of rows:");
        rows=sc.nextInt();
        for(i=1;i<rows+1;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
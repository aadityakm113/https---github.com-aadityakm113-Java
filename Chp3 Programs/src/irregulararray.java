import java.util.Scanner;

public class irregulararray {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();

        int [][]array= new int[n][];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number of columns:  ");
            int col=sc.nextInt();

            array[i]= new int [col];

            System.out.println("Enter row elements: ");
            for(int j=0;j<col;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your array: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

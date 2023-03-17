//Matrix multiplication
public class Matrix 
{
    public static void main(String[] args)
    {
        int a[][]={{4,2,1},{5,3,8},{7,9,1}};
       int b[][]={{12,50,11},{47,15,10},{6,4,2}};
        int c[][]=new int[3][3];
        
        //printing the first matrix
        System.out.println("Matrix 1:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        //printing the second matrix
        System.out.println("Matrix 2:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n");


        //matrix multiplication
        System.out.println("Multiplied matrix:");
        
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

//Program that reverses an array and stores it in the same array.
public class reverse {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n =sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array: "+Arrays.toString(arr));

        System.out.println("Reversed Array: ");
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            
        }
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
    
}

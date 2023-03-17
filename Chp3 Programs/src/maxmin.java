//Program to find Maximum and minimum value in an array of size "M", passed as argument.

import java.util.*;
class max
{
    max(int[] a)
    {
        int l=a.length;
        int ma=a[0];
        for(int i=0;i<l;i++)
        {
            if(ma<a[i])
            {
                ma=a[i];
            }
        }
        System.out.println("The maximum element in the array is: "+ma);
    }
}

class min
{
    min(int[] a)
    {
        int l=a.length;
        int mi=a[0];
        for(int i=0;i<l;i++)
        {
            if(mi>a[i])
            {
                mi=a[i];
            }
        }
        System.out.println("The minimum element in the array is: "+mi);
    }
}

public class maxmin {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        
        System.out.println("Enter elements in the array");
        for(int i=0;i<n;i++)
        {
            int elements=sc.nextInt();
            arr[i]=elements;
        }
        max a= new max(arr);
        min b = new min(arr);
        sc.close();
    }
    
}

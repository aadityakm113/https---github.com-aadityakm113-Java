//Program that copies contents of one array to another using length member.
import java.util.*;
public class copy {
    public static void main(String[] args)
    {
        int[] arr1={5,6,7,9,8,4,3};
        int[] arr2= new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.println("Source Array: " + Arrays.toString(arr1));
        System.out.println("Destination Array: " + Arrays.toString(arr2));
    }
    
}

import java.util.*;

//Program to find element from an sorted array using binary search (java.til.package)
/*class bs
{

}*/
public class binarysearch {
    public static void main(String[] args)
    {
        int[] sortedarr= {1,3,5,7,9,11,12,13};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int n= sc.nextInt();

        int index=(Arrays.binarySearch(sortedarr, n));
        if(index>=0)
        {
            System.out.println("Number found at index position: "+index);
        }
        else
        {
            System.out.println("Number not found");
        }
        sc.close();
    }
    
}

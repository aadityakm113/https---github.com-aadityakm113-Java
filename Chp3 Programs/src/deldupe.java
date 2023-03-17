import java.util.Arrays;

public class deldupe {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,4};
        int size=arr.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=arr[size-1];
                    size--;
                    j--;

                }
            }
        }
        int[] newarr=new int[size];
        System.arraycopy(arr, 0, newarr, 0, size);
        System.out.println("Original array: "+Arrays.toString(arr));
        System.out.println("New array: "+Arrays.toString(newarr));
    }
    
}

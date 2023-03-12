//Program in Java to display the multiplication table of a given integer

import java.util.*;
public class multitable {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+num*i);
        }

        sc.close();
    }
    
}

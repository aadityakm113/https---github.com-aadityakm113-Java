//convert decimal to binary and print its binary equivalent
import java.util.*;

public class DectoBin 
{
    
    public static String reverseString(String str)
    {  
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        return rev;  
    }  
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number: "); 
        int num=sc.nextInt();
        String binary="";
        int temp=num;

        while (temp>0)
        {
            if(temp%2==1)
            {
                binary+=1;
            }
            else
            {
                binary+=0;
            }
            temp/=2;
        }

        System.out.print("Your number in binary is: "+reverseString(binary));
        sc.close();
    }
    
}

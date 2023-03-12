import java.util.*;
public class Armstrong {
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number: "); 
        int num=sc.nextInt();
        int total=0;
        int temp=num;
        
        while (temp!=0)
        {
            int rem=temp%10;
            total+=(rem*rem*rem);
            temp/=10;

        }
        if(total==num)
            System.out.println("It is an Armstong number");
        else
            System.out.println("It is not an Armstrong number");  
        sc.close();
    }
}

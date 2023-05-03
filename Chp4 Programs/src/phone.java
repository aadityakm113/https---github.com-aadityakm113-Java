import java.util.Scanner;

abstract class Telephone
{
    public abstract void lift();
    

    public abstract void disconnected();

}
class SmartTelephone extends Telephone
{
    public void lift()
    {
        System.out.println("Called lifted");
    }
    public void disconnected()
    {
        System.out.println("Call disconnected");
    }
}
public class phone {

    
    public static void main(String[] args)
    {
        System.out.println("Enter 1 to lift and 2 to disconnect");
        SmartTelephone phone = new SmartTelephone();
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        
        if(x==1)
        {
            phone.lift();
        }
        else if(x==2)
        {
            phone.disconnected();
        }
        sc.close();
    }
}

import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args)
    {
        String userid="aadityakm113";
        String pass="abc123";
        //int countu=0;
        int countp=0;
        System.out.print("Enter your user id\n");
        Scanner sc= new Scanner(System.in);
        if(sc.nextLine().equals(userid))
        {
            System.out.print("Valid Username\n");
            System.out.print("Enter your password:\nYou have 3 attempts. \n");
        }
        /*else
        {
            System.out.print("Invalid Username. Please try again.\n");
            while(countu<2)
            {
                if(sc.nextLine().equals(userid))
            {
                System.out.print("Valid Username\n");
                System.out.print("Enter your password:\nYou have 3 attempts. \n");
                break;
            }
            else
            {
                countu+=1;
                System.out.print("Invalid Username. Please try again.\n");
            }
            }
        }*/
        while(countp<3)
        {
            if(sc.nextLine().equals(pass))
            {
                System.out.print("Access Granted");
                break;
            }
            else
            {
                countp+=1;
                System.out.print("Invalid Password. Please try again.\n");
            }
        }
        sc.close();
        }
    }
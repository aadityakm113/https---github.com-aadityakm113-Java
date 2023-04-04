import java.util.*;

class Account
{
    int acc, pin;
    double balance;

    Account()
    {
        this.acc=001;
        this.pin=1029;
        this.balance=5000;
    }
}
public class App extends Account {
    Scanner sc = new Scanner(System.in);

    public void login()
    {
        
        System.out.println("Enter your account number: ");
        int a=sc.nextInt();
        System.out.println("Enter your pin nunber: ");
        int p=sc.nextInt();

        if(acc==a)
        {
            if(pin==p)
            {
                menu();
            }
        }
        else
        {
            System.out.println("Invalid Credentials.");
        }
        sc.close();
    
    }

    public void Withdraw()
    {
        System.out.println("Enter the amount you want to withdraw: ");
        int with=sc.nextInt();
        if (with>balance)
        {
            System.out.println("Insufficient funds.");
        }
        else
        {
            balance-=with;
            System.out.println("Your current balance is: "+balance+". Please collect your cash.");
        }
    }

    public void deposit()
    {
        System.out.println("Enter the amount you want to deposit: ");
        int dep=sc.nextInt();
        balance+=dep;
        System.out.println("Your current balance is: "+balance);
    }

    public void checkBal()
    {
        System.out.println("Your current balance is: "+balance);
    }

    public void menu()
    {
       
        System.out.println("You have successfully logged in! How may we be of service?\n1.Withdraw Money\n2.Check Balance\n3.Deposit\n4.Exit");

        int x=sc.nextInt();
        switch(x)
        {
            case 1:
                Withdraw();
                break;

            case 2:
                checkBal();
                break;
            
            case 3:
                deposit();
                break;

            case 4:
                System.out.println("Thank you for using this ATM. Have a great day!");
                break;
            
            default:
                System.out.println("Please try again entering a valid option.");
                break;

        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Aadi Bank ATM. Please enter your account details to enter.");
        
        App a= new App();
        a.login();
        
        sc.close();
    }
    
}

class Account{
    String accID, type;
    double balance;
    final String bank = "Gitam";

    Account(){
        this.accID = "default123";
        this.balance = 0.0;
    }

    Account(String ID, double bal){
        this.accID = ID;
        this.balance = bal;
    }

    //Is inherited but cannot be overidden
    final void checkBal(){
        System.out.println("Account ID:"+this.accID+"\nAccount Balance:"+this.balance);
    }

    void printType(){
        System.out.println("Account type: Default");
    }

}

//Savings inherits the Account class
class Savings extends Account{
    Savings(String ID, double bal){
        super(ID,bal);
        this.type = "Savings";
    }

    void deposit(double depo){
        this.balance+=depo;
    }

    void withdraw(double depo){
        this.balance-=depo;
    }

    //printType is inherited from the Account class and overridden in Savings class
    void printType(){
        System.out.println("Account type: Savings");
    }

}

public class acc {
    public static void main(String args[]){
        Account a1 = new Account();
        Account s1 = new Savings("save123",500.00); //polymorphism
        Savings s2 = new Savings("save345", 0);
        
        a1.checkBal();
        s1.checkBal();
        s2.checkBal();

        a1.printType();
        s1.printType();
        s2.printType();

        /* 
        Deposit cannot be accessed by a1 and s1 as they are Account objects
        a1.deposit(123.00);
        s1.deposit(500.00);
        */
        s2.deposit(100.00);
        s2.withdraw(50);

        //a1.checkBal();
        //s1.checkBal();
        s2.checkBal();
    }
}
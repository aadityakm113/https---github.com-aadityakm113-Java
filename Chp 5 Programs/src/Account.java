class minBalanceException extends Exception{
	public minBalanceException(String s) {
		super(s);
	}
}

public class Account {
	String accno, name;
	float bal, minBal;
	
	Account(String n,String ano,float b,float mb){
		this.name = n;
		this.accno = ano;
		this.bal = b;
		this.minBal = mb;
	}
	
	void withdraw(float val) {
		try {
			if((bal-val)<minBal) {
				throw new minBalanceException("Balance less than minimum balance");
			}
			else {
				this.bal-=val;
			}
		}catch(minBalanceException m) {
			System.out.println("Exception: "+m.getMessage());
		}
	}
	
	void deposit(float val) {
		this.bal+=val;
	}
	
	public static void main(String args[]) {
		Account a = new Account("Chai","1234",500,500);
		a.withdraw(100);
	}
}
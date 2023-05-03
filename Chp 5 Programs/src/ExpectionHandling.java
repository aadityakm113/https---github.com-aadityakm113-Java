import java.util.Scanner;

class AgeVerification extends Exception{
	public AgeVerification(String s) {
		super(s);
	}
}
class PassStrength extends Exception{
	public PassStrength(String s) {
		super(s);
	}
}
class PasswordMatch extends Exception{
	public PasswordMatch(String s) {
		super(s);
	}
}
public class ExpectionHandling {
	static String uname, pass1, pass2;
	static int age;
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username: ");
		uname = sc.nextLine();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a password: ");
		pass1 = sc.nextLine();
		System.out.println("Reenter the password: ");
		pass2 = sc.nextLine();
		
		try {
			if(age<18) {
				throw new AgeVerification("Minors cannot register");
				
			}
			else if(pass1.length()<10) {
				throw new PassStrength("Weak password");
			}
			else if(!pass1.equals(pass2)) {
				throw new PasswordMatch("Passwords do not match");
			}
			
		}
		catch(AgeVerification a) {
			System.out.println(a.getMessage());
		}
		catch(PassStrength p) {
			System.out.println(p.getMessage());
		}
		catch(PasswordMatch pm) {
			System.out.println(pm.getMessage());
		}
		finally {
			System.out.println("Thank you for using this service.");
			sc.close();
		}
		
	}
}
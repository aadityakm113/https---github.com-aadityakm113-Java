import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AgeExceedsLimit extends Exception{
	public AgeExceedsLimit(String s) {
		super(s);
	}
}
class NameNotValidException extends Exception{
	public NameNotValidException(String s) {
		super(s);
	}
}
public class Employee {
	String ename;
	int eage;
	
	boolean checker(String s) {
		Pattern p = Pattern.compile("(.)*(\\d)(.)*", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		boolean res = m.find();
		return res;
	}
	
	Employee(String en, int ea){
		try {
			if(ea>50) {
				throw new AgeExceedsLimit("Age exceeds the limit");
			}
			else {
				this.eage = ea;
			}
			if(checker(en)){
				throw new NameNotValidException("Name contains numbers");
			}
			else {
				this.ename=en;
			}
		}
		catch(AgeExceedsLimit AE) {
			System.out.println(AE.getMessage());
		}
		catch(NameNotValidException NE) {
			System.out.println(NE.getMessage());
		}
	}
	
	public static void main(String args[]) {
		Employee e = new Employee("Aaditya1",35);
        e.checker("Aaditya1");
	}
}

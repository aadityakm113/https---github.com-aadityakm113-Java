import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AgeNotWithinRangeException extends Exception{
	public AgeNotWithinRangeException(String s) {
		super(s);
	}
}
class NameNotValidException extends Exception{
	public NameNotValidException(String s) {
		super(s);
	}
}
public class Student {
	String name;
	int age;
	
	boolean checker(String s) {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		boolean res = m.find();
		return res;
	}
	
	Student(String n, int a){
		try {
			if(!(a>15 && a<21)) {
				throw new AgeNotWithinRangeException("Age not in the required range");
			}
			else {
				this.age = a;
			}
			if(checker(n)){
				throw new NameNotValidException("Name contains special characters");
			}
			else {
				this.name=n;
			}
		}
		catch(AgeNotWithinRangeException ae) {
			System.out.println(ae.getMessage());
		}
		catch(NameNotValidException ne) {
			System.out.println(ne.getMessage());
		}
	}
	
	public static void main(String args[]) {
		Student s = new Student("Aaditya",20);
        s.checker("Aaditya");
	}
}
import java.util.Scanner;

class Student
{
	int ccode;
	String clgname;
	String sname,gender;

	Student()
	{
		ccode = 1234;
		clgname = "GITAM";
	}

	void readDet()
	{
		Scanner sc = new Scanner(System.in);
		sname = sc.nextLine();
		gender = sc.nextLine();
		sc.close();
	}

	void display()
	{
		System.out.println("**********************");
		System.out.println("C Code: "+ccode+" : "+clgname);
		System.out.println("Name : "+sname);
		System.out.println("Gender : "+gender);
		System.out.println("**********************");
		
	}
	
	
}

public class TestStu
{
	public static void main(String a[])
	{
		Student s = new Student();
		s.readDet();
		s.display();
	}
		
	
}
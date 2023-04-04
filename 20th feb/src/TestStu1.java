import java.util.*;

class Student 
{
    // variable declaration
    String id,name,cname;
    
 
    //default constructor 
    Student()
    {
        this.cname = "GITAM";
    }
    
    // parameterized constructor
    Student(String id, String name)
    {
	// calling def constructor in another constructor
	// is constructor chaining

        this();		
        this.id = id;
        this.name = name;
    }
 
    // display() method to display
    
    public void display()
    {
        System.out.println("------------------------------");
        System.out.println("Student Regno :  " + id );
        System.out.println("Student Name :  " + name );
        System.out.println("Student College :  " + cname );
        System.out.println("------------------------------");
    }
}
public class TestStu1
{
 
    public static void main(String args[])
    {
 
        // Declaring an array of student class 
        Student[] arr;
 
        // Allocating memory for 2 objects
        // of type student
        arr = new Student[2];
 
        for(int i=0;i<2;i++)
        {
            
        Scanner sc = new Scanner(System.in);
        // Creating actual student objects
        System.out.println("Enter Regno : ");
        String x = sc.nextLine();
        System.out.println("Enter Name : ");
        String y = sc.nextLine();
        arr[i] = new Student(x,y);
        sc.close();
       
        }
 
        // Displaying the student data
       for(int i=0;i<2;i++)
        {
            
        arr[i].display();
        }
    }
}
 

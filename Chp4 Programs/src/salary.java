class Member
{
    String Name,Address;
    int Age;
    String Number;
    float Salary;

    Member(String Name,int Age, String Number,String Address,int Salary)
    {
        this.Name=Name;
        this.Age=Age;
        this.Number=Number;
        this.Address=Address;
        this.Salary=Salary;
    }
    void printSalary()
    {
        System.out.println(Salary);
    }
}

class Employee extends Member
{
    String Specialization;
    Employee(String Name,int Age, String Number,String Address,int Salary,String Specialization)
    {
        super(Name, Age, Number, Address, Salary);
        this.Specialization=Specialization;
    }
    @Override
    public String toString() 
    {
        return Name+" "+Age+ " "+Number+" "+Address+" "+Salary+" "+Specialization+" ";
    }
}

class Manager extends Member 
{
    String Department;
    Manager(String Name,int Age, String Number,String Address,int Salary,String Department)
    {
        super(Name, Age, Number, Address, Salary);
        this.Department=Department;
    }
    @Override
    public String toString() 
    {
        return Name+" "+Age+ " "+Number+" "+Address+" "+Salary+" "+Department+" ";
    }
}
public class salary 
{
    public static void main(String[] args)
    {
        Employee a = new Employee("Aaditya", 20,"9502663840","Kokapet", 50000, "Guitarist");
        Manager b = new Manager("Siddarth", 19,"9542756044" , "Kukatpally", 50000, "TFA");

        System.out.println("Employee details: "+a.Name+a.Age+a.Number+a.Salary+a.Specialization);
        System.out.println("Manager details: "+b.toString());
        a.printSalary();
        b.printSalary();
    }
}

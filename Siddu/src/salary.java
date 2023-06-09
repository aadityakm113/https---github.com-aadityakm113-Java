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
        Employee emp = new Employee("Loalith", 19,"8639538285","Mallampet", 45000, "Gamer");
        Manager man = new Manager("Siddarth", 19,"9542756044" , "Kukatpally", 50000, "Engineering");

        System.out.println("Employee details: "+emp.toString());
        System.out.println("Manager details: "+man.toString());
        emp.printSalary();
        man.printSalary();
    }
}

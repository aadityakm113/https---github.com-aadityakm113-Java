package ch4programs;
interface work
{
    void engineer();
}

interface hobby
{
    void musician();
}

class person implements work,hobby
{
    public void engineer()
    {
        System.out.println("Person is an engineer");
    }

    public void musician()
    {
        System.out.println("Person is a musician in free time");
    }
}
public class interinher {
    public static void main(String[] args)
    {
        person aadi = new person();
        aadi.engineer();
        aadi.musician();
    }
    
}

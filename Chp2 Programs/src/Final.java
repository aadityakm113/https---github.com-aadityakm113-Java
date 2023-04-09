// Illustrate the usage of ‘this’, ‘final’ and ‘finalize’ using a java program. 
public class Final {
    final int a=10;
    private int b;
    Final(int num)
    {
        this.b=num;
    }
    int getb()
    {
        return this.b;
    }

    public static void main(String[] args)
    {
        Final f = new Final(11);
        System.out.println(f.getb());
        //f.finalize();
        System.out.println(f.getb());
    }
    
}

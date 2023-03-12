import java.util.Scanner;

public class emp {
    public static void main(String args[]) 
    {
        String[] names= new String[5];
        float[] sal= new float[5];
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter names of the 5 employees: ");
        for(int i=0;i<5;i++)
        {
            names[i]=sc.next();
        }

        System.out.println("Enter salaries of the 5 employees: ");
        for (int j=0;j<5;j++)
        {
            sal[j]=sc.nextFloat();
        }

        for(String i: names)
        {
            System.out.println(i);
        }

        for(float i: sal)
        {
            System.out.println(i);
        }

        System.out.println("Enter employee name to see salary: ");

        String name = sc.next();
        for(int i=0;i<5;i++)
        {
            if (names[i].equals(name))
            {
                System.out.println(sal[i]);
                break;
            }
        }


        System.out.println("Updated Salaries: ");
        for(int i=0;i<5;i++)
        {
            if (sal[i]<10000)
            {
                sal[i]+=2000;
            }
        }
        
        for(float i: sal)
        {
            System.out.println(i);
        }

        sc.close();
    }
}

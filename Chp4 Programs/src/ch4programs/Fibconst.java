package ch4programs;
import java.util.Scanner;
class fibonacci{
    int num1, num2, terms;
    fibonacci(int num1,int num2){
        num1 = this.num1;
        num2 = this.num2;
        //terms = this.terms;
    }
    void genseries(int terms){
        
        int i = 0;
        int sum = 0;
        while(i<terms){
            System.out.println(num1+" ");
            sum = num1+num2;
            num2 = sum;
            i++;
        }

        


    }
}

public class Fibconst {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms required :");
        int terms = sc.nextInt();
        fibonacci f = new fibonacci(0,1);
        f.genseries(terms);
        sc.close();
    }
    
}
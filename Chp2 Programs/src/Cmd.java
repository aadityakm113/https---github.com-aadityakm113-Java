// Read the command line arguments and print the total number of arguments and its values.

public class Cmd {
    public static void main(String args[]){
        if(args[2].equals("male"))
            System.out.println("Welcome Mr."+args[0]+" "+args[1]);
        else
            System.out.println("Welcome Ms."+args[0]+" "+args[1]);
    }
}

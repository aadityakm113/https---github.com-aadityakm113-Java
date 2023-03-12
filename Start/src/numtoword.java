import java.util.Scanner;

public class numtoword {

    private static final String[] units = { "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };

    private static final String[] tens = { 
            "",         // 0
            "",         // 1
            "Twenty",   // 2
            "Thirty",   // 3
            "Forty",    // 4
            "Fifty",    // 5
            "Sixty",    // 6
            "Seventy",  // 7
            "Eighty",   // 8
            "Ninety"    // 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "Minus " + convert(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();
        if(num>=100 && num<=999){
            String inWords = convert(num);
            System.out.println("The number in words is: " + inWords+"Dollars");
        }else{
            System.out.println("Invalid Input. Please enter 3 digit number");
        }
        scanner.close();
    }
}

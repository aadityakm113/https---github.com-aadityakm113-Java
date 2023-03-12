import java.util.Scanner;

public class NumberToWords {

    private static final String[] ONES = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static final String[] TENS = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    private static final String[] TEENS = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Invalid input. Please enter a 3-digit number.");
        } else {
            System.out.println(convert(num)+"dollars" );
        }
        scanner.close();
    }

    private static String convert(int num) {
        String result = "";

        int hundred = num / 100;
        int remainder = num % 100;
        int tens = remainder / 10;
        int ones = remainder % 10;

        if (hundred > 0) {
            result += ONES[hundred] + " hundred ";
        }

        if (tens == 1) {
            result += TEENS[ones] + " ";
        } else {
            result += TENS[tens] + " ";
            result += ONES[ones] + " ";
        }

        return result;
        
    }
}

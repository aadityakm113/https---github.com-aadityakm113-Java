public class nestedException {
	static int nums[] = new int[5];
    public static void main(String[] args) {
        try {
            try {
                int num1 = 10;
                int num2 = 0;
                int result = num1 / num2; 
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                throw new RuntimeException("Inner Exception occurred", e); 
            }
            try {
            	nums[5]=5;
            }catch(ArrayIndexOutOfBoundsException ae) {
            	System.out.println("Error: " + ae.getMessage());
                throw new RuntimeException("Inner Exception occurred", ae);
            }
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
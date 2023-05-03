package pack3;

public class EquiException extends Throwable{
    public static void checkEQ(int s1,int s2, int s3) {
		if(s1==s2 && s2==s3) {
			try{
	            throw new EquiException();
	            }
			catch(EquiException ae)
	            {
	            System.out.println("Exception: Triangle is equilateral");
	            }
		}
	}
}

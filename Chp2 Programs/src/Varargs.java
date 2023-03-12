//How to pass the variable length arguments in java, illustrate with an example program. 
class Varargs {
	static void variable(int... a)
	{
		System.out.println("Number of arguments: "+ a.length);
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		variable(1, 2, 3, 4);
		variable();
	}
}

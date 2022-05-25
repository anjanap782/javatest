//finally block
// For each try block there can be zero or more catch blocks, but only one finally block.
public class E4 {

	public static void main(String[] args) {
		try
		{
			int a=10/2;
			int b=10/0;
			System.out.println(a);
			System.out.println(b);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("cannt divide by 0");
		}
		////executed regardless of exception occurred or not  
		//exception occurr but not handled by the catch block
		finally
		{
		System.out.println("last line");

	}
	}

}

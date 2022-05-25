/*1.handle the exception without maintaining the order of exceptions (i.e. from most specific to most general).
 * 2.generate NullPointerException, but didn't provide the corresponding exception type. In such case, the catch block containing the parent exception class Exception will invoked.
 * 3.try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is executed.
 * 4.Multiple catch block
 */


public class E2 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[4];
			String s=null;
			System.out.println(s.length());
			a[3]=8/0;
			System.out.println(a[5]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic  exception");
		}
		catch(Exception e)
		{
			System.out.println("general exception");
		}
		

	}

}

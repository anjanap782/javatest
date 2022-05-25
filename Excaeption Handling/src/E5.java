//throw unchecked exception
//throw checked exceptn
//throw userdefined exceptn

	

public class E5 {
	public static void check(int mark) 
	{
		if( mark<20)
		{
			
			throw new ArithmeticException("you failed test");
		}
		else
		{
			System.out.println("passed");
		}
	}
	
	
	

	public static void main(String[] args)  {
		check(10);
		
	}

}

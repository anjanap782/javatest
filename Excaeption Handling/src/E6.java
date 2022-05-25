//throw userdefined exceptn

class userdefinedException extends Exception
{

	public userdefinedException(String string) {
		super(string);
		
	}
}



public class E6 {

	public static void main(String[] args) {
		try
		{
		throw new  userdefinedException("you failed");

	}
		catch(userdefinedException u)
		{
			System.out.println("handled exception");
			System.out.println(u.getMessage());
			
		}
		

}
}

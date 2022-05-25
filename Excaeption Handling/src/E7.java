//Exception propagatn
//By default, Checked Exceptions are not forwarded in calling chain (propagated).
public class E7 {

	void a()
	{
		int a=20/0;
		//throw  new  java.io.IOException("io error");//checked
	}
	void b()
	{
		a();
		System.out.println("in b");
	}
	void c()
	{
		try
		{
			b();
		}
		catch(Exception e)
		{
			System.out.println("handled exception");
		}
	}
	
	
	
	public static void main(String[] args) {
		E7 e=new E7();
		e.c();
		

	}

}

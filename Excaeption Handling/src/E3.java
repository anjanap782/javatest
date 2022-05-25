// place a try block within another try block for two different exceptions.
//2. try block within nested try block (inner try block 2) do not handle the exception. The control is then transferred to its parent try block (inner try block 1). If it does not handle the exception, then the control is transferred to the main try block (outer try block) where the appropriate catch block handles the exception. It is termed as nesting.
public class E3 {

	public static void main(String[] args) {
		
		//outer try block   
		  try{    
		  //inner try block 1  
		    try{    
		     System.out.println("going to divide by 0");    
		     int b =39/0;    
		   }  
		    //catch block of inner try block 1  
		    catch(ArithmeticException e)  
		    {  
		      System.out.println("do not divide by 0");  
		    }    
		       
		    
		    //inner try block 2  
		    try{    
		    int a[]=new int[5];    
		  
		    //assigning the value out of array bounds  
		     a[5]=4;    
		     }  
		  
		    //catch block of inner try block 2  
		    catch(ArrayIndexOutOfBoundsException e)  
		    {  
		       System.out.println("arrayindex exception");  
		    }    
		  
		      
		    System.out.println("other statement");    
		  }  
		  //catch block of outer try block  
		  catch(Exception e)  
		  {  
		    System.out.println("handled the exception (outer catch)");  
		  }    

	}

}

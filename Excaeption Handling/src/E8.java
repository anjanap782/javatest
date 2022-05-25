


//If exception occurs-throws
//no exception
//We are allowed to throw only one exception at a time


import java.io.IOException;

 class Testthrows4 {

	 void method() throws IOException{  
		 
		 throw new IOException("device error");  
		
		 }  
		}  
		class E8{  
		   public static void main(String args[]) throws IOException{//declare exception  
			   Testthrows4 m=new Testthrows4();  
		     m.method();  
		  
		    //System.out.println("normal flow...");  
		  }  

}

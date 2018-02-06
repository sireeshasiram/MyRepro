package Learning;

public class A{

	 
	 static int a = 1111;
	// *static
	 {
	        a = a-- - --a;
	        System.out.println(a);
	        
	 }//
	    
	{
	        a = a++ + ++a;
	        System.out.println(a);
	 }
	 
	 public static void main(String[] args)  {
	 
	      System.out.println(a);
	 
	    }
	 
	}
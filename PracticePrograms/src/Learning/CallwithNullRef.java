package Learning;

public class CallwithNullRef {
	
	 public static void greeting() {
	        System.out.println("Hello World");
	    }

    public static void main(String... args)
    {
    	CallwithNullRef test = null;
        test.greeting(); // call with null reference
    }
   
}

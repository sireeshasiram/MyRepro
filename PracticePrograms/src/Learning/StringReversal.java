package Learning;
public class StringReversal {

  public void reverseString() {
      String str="welcome to citrix";
      char[]chr=str.toCharArray();
      System.out.println("\nsring length is:"+str.length());
   
      System.out.print("\nsring Reversal is:");
      for(int i=chr.length-1; i>=0; i--)
      {
     char reversedstring=chr[i];
     
    	  System.out.print(reversedstring);
    
    	  if(!Character.isLetter(reversedstring))
    	  {
    		 
    		  break;
    		 
    	  }
      }
     
  }
 


	public static void main(String[] args) {
		StringReversal s=new StringReversal();
		
		System.out.print("In main loop");
		s.reverseString();
	}

}

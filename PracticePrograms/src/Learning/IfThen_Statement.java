package Learning;

public class IfThen_Statement {
 
	public static void main(String[] args) {
		String sDay = "Sunday";
		int iDay = 7;
		
	/*	if(sDay.equals("Sunday")){
			System.out.println("Today is Sunday");
		} */
		
		if(iDay==7){
			System.out.println("Today is Sunday");
			
			String obj1 = new String("xyz");

			// now obj2 and obj1 reference the same place in memory
			String obj2 = obj1;

			if(obj1 == obj2)
			   System.out.println("obj1==obj2 is TRUE");
			else
			  System.out.println("obj1==obj2 is FALSE");

		}
	}
}
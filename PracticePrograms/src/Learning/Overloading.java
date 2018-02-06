package Learning;

public class Overloading {
	   public void f1(Integer i){
	     System.out.println("inside 1");
	   }
	   public void f1(int i,int j){
	     System.out.println("inside 2");
	   }
	   public static void main(String args[]){
		   Overloading o= new Overloading();
		   o.f1(8,10);
	     o.f1(8);
	     
	   }
	}

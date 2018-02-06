package Learning;


public class Parent {

 public static void staticMethod(){
   System.out.println("Inside Parent static");
 }
 public static void main(String[] args) {
   Parent p = new Child();
   p.staticMethod();
 }
}
class Child extends Parent {
   public static void staticMethod(){
     System.out.println("Inside Child static");
   }
}

//static methods cannot be over ridden
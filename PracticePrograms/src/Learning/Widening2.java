package Learning;

public class Widening2 {
  public void f1(Object o1) {
   System.out.println("Inside f1 with object as argument");
  }
  public void f1(String s) {
    System.out.println("Inside f1 with String as argument");
  }
  public void f1(Integer  i){
    System.out.println("Inside f1 with Integer as argument");
  }
  public static void main(String[] args) {
    new Widening2().f1(null);
  }
}

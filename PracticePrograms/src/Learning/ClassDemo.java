package Learning;


import java.lang.*;

public class ClassDemo {

   public static void main(String[] args) {

     ClassDemo c = new ClassDemo();
     Class cls = c.getClass();
     System.out.println("Class is  = " + cls);
     // returns the name of the class
     String name = cls.getName();
     System.out.println("Class Name = " + name);
     
     // returns the simple name of the class
     String sname = cls.getSimpleName();
     System.out.println("Class SimpleName = " + sname);     
   }
} 
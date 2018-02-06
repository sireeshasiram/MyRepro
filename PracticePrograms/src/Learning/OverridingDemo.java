package Learning;
/*Example 1 for overriding*/
/*class Walking
{  
void walk()
{
System.out.println("Man walking fastly");
}  
}  
class Man extends Walking
{  
void walk()
{
System.out.println("Man walking slowly");
}
}

class OverridingDemo
{  
public static void main(String args[])
{  
Man obj = new Man(); 
obj.walk();
}
}*/

/*Example 2 for Overriding*/

class Person
{
String name;
void sleep(String name)
{
this.name=name;
System.out.println(this.name +"is sleeping+8hr/day");
}
void walk()
{
System.out.println("this is walk()");
System.out.println("-----------------");
}
};
class Student extends Person
{
void writExams()
{
System.out.println("only student write the exam");
}
void sleep(String name)
{
super.name=name;
System.out.println(super.name +"is sleeping 6hr/day");
System.out.println("------------------");
}
};
class Developer extends Person
{
public void designProj()
{
System.out.println("Design the project");
}
void sleep(String name)
{
super.name=name;
System.out.println(super.name +"is sleeping 4hr/day");
System.out.println("------------------");
}
};
class OverridingDemo
{
public static void main(String[] args)
{
Student s1=new Student();
s1.writExams();
s1.sleep("student");
s1.walk();
Developer d1=new Developer();
d1.designProj();
d1.sleep("developer");
}
}

//super keyword used for base class specific calling 
//

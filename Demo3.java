class Student
{

 int id;
 String name;

 void display()
  {
System.out.println(id);
System.out.println(name);
  }

}

class Demo3
{

public static void main(String[] args)
{
  Student s1=new Student();
   Student s2=new Student();
    s1.id=16;
    s1.name="Ram";

    s2.id=18;
    s2.name="Vivek";


    s1.display();
    s2.display();
}

}
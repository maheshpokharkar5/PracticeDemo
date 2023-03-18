class Student
{
   int id;
   String  name;
}

class Demo2
{

public static void main(String[] args)
    {
     Student s1=new Student();
     Student s2=new Student();

      s1.id=11;
       s1.name="Ganesh";

         s2.id=12;
        s2.name="Vinayak";

         System.out.println(s1.id);
         System.out.println(s1.name);

       System.out.println(s2.id);
        System.out.println(s2.name);
     }

}
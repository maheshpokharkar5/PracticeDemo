class Employee
{
   int id;
   String name;
   String city;
   int salary;
  
   void display()
   {

 System.out.println(id);
 System.out.println(name);
 System.out.println(city);
 System.out.println(salary);
 System.out.println();
   }

}


class Demo4
{
public static void main(String[] args)
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();

e1.id=11;
e1.name="Ganesh";
e1.city="Pune";
e1.salary=67000;


e2.id=12;
e2.name="Vivek";
e2.city="Mumbai";
e2.salary=87000;

e3.id=13;
e3.name="Sarika";
e3.city="Chennai";
e3.salary=80000;

   e1.display();
   e2.display();
    e3.display();



}
}

//Without Multithreading

class A
{
  public void run()
   {
      for(int i=1;i<=10;i++)
        {
  System.out.println("This is class A");
        }
   }
}


class B
{
  public void run()
   {
      for(int i=1;i<=10;i++)
        {
  System.out.println("This is class B");
        }
   }
}


class ThreadDemo1
{
  public static void main(String[] args) 
   {
     A a1=new A();
     B b1=new B();
       a1.run();
       b1.run();
   }
}
//Multithreading

class A extends Thread
{
  public void run()
   {
      for(int i=1;i<=10;i++)
        {
  System.out.println("This is class A "+i);
              
             try
         {
         Thread.sleep(500);
         }
        catch(Exception e)
         {

         }

               
        }
   }
}


class B extends Thread
{
  public void run()
   {
      for(int i=1;i<=10;i++)
        {
  System.out.println("This is class B "+i);

          try
         {
         Thread.sleep(500);
         }
        catch(Exception e)
         {

         }

        }
   }
}


class ThreadDemo2
{
  public static void main(String[] args) 
   {
     A a1=new A();
     B b1=new B();
       a1.start();
       b1.start();
   }
}
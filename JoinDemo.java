class A implements Runnable
{
   public void run()
   {
      for(int i=2;i<=20;i=i+2)
     {
   System.out.println("Table of 2 "+i);
     }
   }
}

class B implements Runnable
{
   public void run()
   {
      for(int i=5;i<=50;i=i+5)
     {
   System.out.println("Table of 5 "+i);
     }
   }
}

class C implements Runnable
{
   public void run()
   {
      for(int i=7;i<=70;i=i+7)
     {
   System.out.println("Table of 7 "+i);
     }
   }
}


class JoinDemo
{
    public static void main(String[] args)
    {
      A a1=new A();
     B b1=new B();
     C c1=new C();
    
    Thread t1=new Thread(a1);
    Thread t2=new Thread(b1);
    Thread t3=new Thread(c1);

    
    t1.start();

     try
     {
    t1.join();
     }
   catch(Exception e)
   {

   }

    t2.start();
    t3.start();

    }
}
class A extends Thread
{
    public void run()
    {
   for(int i=1;i<=10;i++)
    {
     System.out.println("Thread 1");
    }
 
    }
}


class LiveDemo
{
  public static void main(String[] args)
   {
      A a1=new A();
   
     System.out.println(a1.isAlive());
      a1.start();
   System.out.println(a1.isAlive());
   }
}
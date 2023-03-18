class A extends Thread
{
    public void run()
   {
      boolean res=Thread.currentThread().isDaemon();
     
           if(res)
           { 
   System.out.println("Thread is Daemon Thread");
          }
          else
          {
   System.out.println("Thread is NOT a Daemon Thread");
          }
 
   }
}

class DaemonDemo
{
  public static void main(String[] args)
   {
    A t1=new A();
    A t2=new A();
    A t3=new A();
   t1.setDaemon(true);
     t1.start();
     t2.start();
     t3.start();
  }
}
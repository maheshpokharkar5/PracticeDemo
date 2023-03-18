
class Table2 extends Thread
{
   public void run()
   {
        for(int i=2;i<=20;i=i+2)
          {
     System.out.println("Table of 2 "+i);
          }
   }
}

class Table5 extends Thread
{
   public void run()
   {
        for(int i=5;i<=50;i=i+5)
          {
     System.out.println("Table of 5 "+i);
          }
   }
}


class ThreadDemo3
{
        public static void main(String[] args)
   {
      Table2   th1=new Table2();
      Table5   th2=new Table5();
       th1.run();
       th2.start();
   }
}
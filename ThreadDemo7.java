//Multithreading

class A extends Thread
{
  public void run()
   {
    System.out.println("Thread is running..........");
   }
}

class ThreadDemo7
{
  public static void main(String[] args) 
   {
     A a1=new A();
  
       a1.start();

  System.out.println( a1.getName()); 
   }
}




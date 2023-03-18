class A extends Thread
{
     A(String name)
   {
     super(name);
    }
  
  public void run()
   {
    System.out.println("Thread is running..........");
   }
}

class ThreadDemo8
{
  public static void main(String[] args) 
   {
     A a1=new A("Simple Thread");
       a1.start();
 
  System.out.println( a1.getName());
    
   }
}
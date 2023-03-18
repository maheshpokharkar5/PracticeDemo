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
      for(int i=7;i<=70;i=i+7)
          {
  System.out.println("Table of 7 "+i);
     

          }
    }

}



class ThreadDemo6
{
   public static void main(String[] args)
    {
       A a1=new A();
     
      B b1=new B();

     Thread t1=new Thread(a1,"Table2");
     Thread t2=new Thread(b1,"Table7");
     t1.start();
     t2.start();  
     
System.out.println(      t1.getName()  );  

System.out.println(      t2.getName() );

    }
}





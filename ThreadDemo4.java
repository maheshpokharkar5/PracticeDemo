class A implements Runnable
{
    public void run()
    {
      for(int i=2;i<=20;i=i+2)
          {
  System.out.println("Table of 2 "+i);

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


class B implements Runnable
{
    public void run()
    {
      for(int i=7;i<=70;i=i+7)
          {
  System.out.println("Table of 7 "+i);
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



class ThreadDemo4
{
   public static void main(String[] args)
    {
       A a1=new A();
     
      B b1=new B();

     Thread t1=new Thread(a1);
     Thread t2=new Thread(b1);



     t1.start();
     t2.start();  
     
  

    }
}

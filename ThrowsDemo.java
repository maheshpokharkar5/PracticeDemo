/*
 throws:

- throws is used to define the called method signature, to inform the caller method that called method might be throw exception.

ex:
   
   int div(int x,int y) throws Exception
   {
     return x/y;
    } 

*/


  class ThrowsDemo
   { 

   static  int div(int x,int y) throws Exception
   {
     return x/y;
    } 

    public static void main(String[] args)
     {
    int res=0;
         try
     {    
         res=div(20,10);
     }
   catch(Exception e)
    {
       System.out.println(e);
    }

     System.out.println(res);

   }
  }
class ExceptionDemo4
{
public static void main(String[] args)
{
       String str="ABCDEF";
  try
   {
     System.out.println(str.length());
   }
  catch(Exception e)
   {
  System.out.println("Exception "+e);
   }
    finally
    {
 System.out.println("I am always executed....");
    }

     System.out.println("End");

}
}
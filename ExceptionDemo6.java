class ExceptionDemo6
{
public static void main(String[] args)
{
  
   try 
   {
    Class.forName("xyz");
   }
   catch(Exception e)
   {
 System.out.println(e);
   }

}
}
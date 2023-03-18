class ExceptionDemo3
{
public static void main(String[] args)
{
String str=null;
  try
   {
     System.out.println(str.length());
   }
  catch(Exception e)
   {
  System.out.println("Exception "+e);
   }
     System.out.println("End");

}
}
import java.sql.*;
class ExceptionDemo7
{
public static void main(String[] args)
{
     try
    {
   DriverManager.getConnection("aa","bb","cc");
    }
    catch(Exception e)
   {
   System.out.println(e);
   }

}
}
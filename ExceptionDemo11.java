import java.io.*;
import java.sql.*;

class ExceptionDemo11
{

   static void display() throws IOException,SQLException
   {
   
      System.out.println("This is throws example");

  }

  public static void main(String[] args)
  {
         try
           {
           display();   
            }
           catch(Exception e)
          {
          }
  }
}
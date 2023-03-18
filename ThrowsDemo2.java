import java.io.*;
import java.sql.*;

 class ThrowsDemo2
   { 

 static void display() throws IOException,SQLException
   {
     System.out.println("Simple method");
    } 

    public static void main(String[] args)
     {

             try
        {
                display();
         }
         catch(IOException e)
        {

         }
         catch(SQLException e)
        {

         }
        
}
  }

/*


      throw                                                                                                              throws
-------------------------------------------------------------------------------------------------------------------------------------------------------------
1. used to throw the exception  explicitly                        1. used to inform the caller method that called method might be throw exception
2. throw followed by instance                                          2. throws followed Exception class name
3. throw follows only one instance                                   3.throws can follows multiple exception class name
4. throw cant be used for checked exception                   4. throw can be used for checked exception



*/






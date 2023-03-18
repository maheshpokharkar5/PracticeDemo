/*
throw
-it is used to throw the exception explicitly(manually)

-syntax:
  throw exception_name;

-It throw the in-built exception and user-defined exception

*/
import java.util.*;
class AgeException extends Exception
{
      AgeException(String name)
   {
          super(name);
    }

}

class ThrowDemo
{
public static void main(String[] args)
 {

  AgeException  ae=new AgeException("Age is not valid");

   
 Scanner sc=new Scanner(System.in);

   int age= sc.nextInt();
        try
   {
           if(age<18)
           {
               throw ae;
            }
  }
   catch(Exception e)
   {
   System.out.println(e);
   }

  }
}
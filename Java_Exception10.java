import java.util.*;
class Java_Exception10
{
public static void main(String[] args)
{

System.out.println("Enter number 1");


Scanner sc1=new Scanner(System.in);
int x=sc1.nextInt();


System.out.println("Enter number 2");
Scanner sc2=new Scanner(System.in);
int y=sc2.nextInt();
int res;
   try
  {
  res=x/y;
  System.out.println("Division "+res);
  }
 catch(Exception e)
   {
  System.out.println(e);
   }

System.out.println("Rest of the program");

}
}
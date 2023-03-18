import java.util.*;
class LeapYearDemo
{
public static void main(String[] args)
{
String ch;

System.out.println("Enter year");
Scanner sc=new Scanner(System.in);

 int x=sc.nextInt();
  
    if(x%4==0)
   {
System.out.println("Year is leap year");
    }
   else
   {
System.out.println("Year is NOT leap year");
   }


}
}
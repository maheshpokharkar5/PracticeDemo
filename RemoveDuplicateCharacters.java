import java.util.*;
class RemoveDuplicateCharacters
{

  public static void main(String[] args)
  {
 String str="ABCDEFGABCRTYUI";

Set<Character> set=new LinkedHashSet<Character>();


   for(int i=0;i<str.length();i++)
   {
   set.add(str.charAt(i));
   }

System.out.println(set);

  }

}
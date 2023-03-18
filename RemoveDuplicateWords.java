import java.util.*;
class RemoveDuplicateWords
{

  public static void main(String[] args)
  {
 String str="ABC PQR LMN ABC RTY ZSR ABC LMN";
 String words[]= str.split("\\s");

Set<String> set=new LinkedHashSet<String>();


   for(int i=0;i<words.length;i++)
   {
   set.add(words[i]);
   }

System.out.println(set);

  }

}
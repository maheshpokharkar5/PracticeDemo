// Write a program to remove the duplicate word from string

//String str="ABC PQR LMN GHT ABC RTY PQR BNM LMN";

//String OutputStr="ABC PQR LMN GHT RTY BNM";
import java.util.*;
class DuplicateWordRemove
{

public static void main(String[] args)
{

String str="ABC PQR LMN GHT ABC RTY PQR BNM LMN";
String OutputStr="";
String word[]=str.split("\\s");
Set<String> set=new LinkedHashSet<String>();

   for(int i=0;i<word.length;i++)
   {
     set.add(word[i]);
   }


   for(String x:set)
   {
  OutputStr=OutputStr+x+" ";
   }

System.out.println(OutputStr);

}
}
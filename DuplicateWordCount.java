// Write a program to count the duplicate word into the string
//String str="ABC PQR LMN PQR ABC RTY PQR BNM LMN ABC";

//String OutputStr="{ABC=3 PQR=3 LMN=2  RTY=1 BNM=1}";
import java.util.*;
class DuplicateWordCount
{

public static void main(String[] args)
{

String str="ABC PQR LMN PQR ABC RTY PQR BNM LMN ABC";
String word[]=str.split("\\s");
Map<String,Integer> map=new LinkedHashMap<String,Integer>();

   for(int i=0;i<word.length;i++)
   {
       Integer x= map.get(word[i]);
         if(x==null)
            {
    map.put(word[i],1);
             }
          else
          {
    map.put(word[i],x+1);
          }
  }

  System.out.println(map);
}
}
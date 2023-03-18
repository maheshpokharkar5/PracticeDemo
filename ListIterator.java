//Accessing the each element of Collection

import java.util.*;

  class ListIterator
  {

   public static void main(String[] args)
   {

   List<String> list=new ArrayList<String>();
    list.add("Ganesh");
    list.add("Ramesh");
    list.add("Vignesh");
    list.add("Sandesh");
    list.add("Dharmesh");

    System.out.println(list);  
 
     for(String str:list)
    {
    System.out.println(str);
    }
 

 


   }
  }
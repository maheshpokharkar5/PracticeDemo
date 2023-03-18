import java.util.*;
class ListIteratorDemo
{

 public static void main(String[] args)
   {

    List<String> list=new LinkedList<String>();
    list.add("Ganesh");
    list.add("Ramesh");
    list.add("Kalpesh");
    list.add("Mitesh");
    list.add("Suresh");
    list.add("Yogesh");

   System.out.println(list);


    for(String str:list)
    {
  System.out.println(str);
    }

   }

}
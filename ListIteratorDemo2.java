import java.util.*;
class ListIteratorDemo2
{

 public static void main(String[] args)
   {

    List<Integer> list=new LinkedList<Integer>();
   list.add(11);
   list.add(12);
   list.add(13);
   list.add(14);
   list.add(15);


   System.out.println(list);


    for(int x:list)
    {
  System.out.println(x);
    }

   }

}
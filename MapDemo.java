//Map= 
/*
-It is used store and manage key-value pair.
-Key of map never be duplicate
-Duplicate value can be accepted
-Map is an interface implemented by HashMap and LinkedHashMap
*/
import java.util.*;
  class MapDemo
  {
  public static void main(String[] argts)
   {
  Map<String,Integer> map=new LinkedHashMap<String,Integer>();
   map.put("Ganesh",76);
   map.put("Vivek",76);
   map.put("Kamlesh",82);
   map.put("Sachin",95);
     map.put("Rajesh",85);
   map.put("Sandesh",92);
   map.put("Dnyanesh",93);
  System.out.println(map);

   }
  }

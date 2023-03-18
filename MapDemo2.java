import java.util.*;
  class MapDemo2
  {
  public static void main(String[] argts)
   {
  Map<String,Integer> map=new LinkedHashMap<String,Integer>();
 System.out.println(  map.put("Ganesh",76));
System.out.println(   map.put("Vivek",76));
System.out.println(   map.put("Kamlesh",82));
   map.put("Sachin",95);
     map.put("Rajesh",85);
System.out.println( map.put("Ganesh",92));
   map.put("Dnyanesh",93);
  System.out.println(map);

   System.out.println(map.get("Ganesh"));


   }
  }
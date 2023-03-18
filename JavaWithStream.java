import java.util.*;
import java.util.stream.*;

class Product
{
int id;
String name;
double price;

Product(int id,String name,double price)
{
this.id=id;
this.name=name;
this.price=price;
}

}

class JavaWithStream
{

public static void main(String[] args)
{

Product p1=new Product(11,"Paragon A",1000);
Product p2=new Product(12,"Bata D",3000);
Product p3=new Product(13,"Adidas G",3200);
Product p4=new Product(14,"Sparx G",2600);
Product p5=new Product(15,"Red Chief L",4000);

List<Product> list=new ArrayList<Product>();
list.add(p1);
list.add(p2);
list.add(p3);
list.add(p4);
list.add(p5);

List<Product> filteredList=list.stream().filter(p->p.price>2000&&p.price<3500).collect(Collectors.toList());

/*

List<Product> filteredList=new ArrayList<Product>();


     for(Product p:list)
     {
           if(p.price>2000&&p.price<3500)
         {
     filteredList.add(p);
          }
     }

*/
for(Product p:filteredList)
{
System.out.println(p.id+" "+p.name+" "+p.price);
}


}

}
import java.util.*;

class ExceptionDemo2
 {
	public static void main(String[] args)
 {
                 Scanner sc1=new Scanner(System.in);
                         int a=sc1.nextInt();
	
                Scanner sc2=new Scanner(System.in);
                        int b=sc2.nextInt(); 
                  System.out.println("Statement 1");
	System.out.println("Statement 2");
	System.out.println("Statement 3");
	System.out.println("Statement 4");
                try
                {
	int x=a/b;
                }
               catch(Exception e)
                 {
                    System.out.println(e);
                  }
	System.out.println("Statement 5");
	System.out.println("Statement 6");
	System.out.println("Statement 7");
	System.out.println("Statement 8");
	System.out.println("Statement 9");
	System.out.println("Statement 10");
	}
}

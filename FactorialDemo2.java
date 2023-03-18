class FactorialDemo2
{

static int factorial(int x)
{
     if(x==0||x==1)
           return 1;
      else
         return   (factorial(x-1)*x);
}

public static void main(String[] args)
{
   int x=4;
   int fact;
   fact= factorial(x);
System.out.println("Factorial of No "+fact);
}
}














/*

factorial(5);
factorial(4)*5
factorial(3)*4*5
factorial(2)*3*4*5
factorial(1)*2*3*4*5
1*2*3*4*5
120
*/




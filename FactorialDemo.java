//Factorial of number

// 5!=5*4*3*2*1=120

//3!=3*2*1=6

//4!=4*3*2*1=24

//0!=1


class FactorialDemo
{
public static void main(String[] args)
{

  int x=5;
   int fact=1;
   for(int i=x;i>=1;i--)  //i 5 4 3 2 1
   {
 fact=fact*i;   //fact=120
   }

System.out.println("Factorial of No "+fact);
}
}
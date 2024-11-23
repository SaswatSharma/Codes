import java.util.*;
class Fibonacci2
{
	public static void main(String[]args)
 	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of n");
	 int n=sc.nextInt();
	 sc.close();
	 System.out.println(fib(n));
	}
	public static int fib(int n)
	{
    //  if(n==0)
    //  return -1;
	//  if(n==1)
	//  return 0;
	//  if(n==2)
	//  return 1;/
     if(n<=2)
     return n-1;
	 return fib(n-1)+fib(n-2);
	}
}
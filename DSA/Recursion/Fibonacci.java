import java.util.*;
class Fibonacci
{
	public static void main(String[]args)
 	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of n");
	 int n=sc.nextInt();
	 sc.close();
 	 System.out.print("0,1"); 
	 fib(n-2,0,1);
	}
	public static void fib(int n,int a,int b)
	{
	 if(n==0)
	 return;
     int c=a+b;
	 System.out.print(","+c);
	 fib(--n,b,c);
	}
}
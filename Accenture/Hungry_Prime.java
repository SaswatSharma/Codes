//Hungry sequence must follow the conditions:-
//1.Every element must be greater than previous.
//2.No jth element must be divisible by ith elment where j>i.
import java.util.*;
class Hungry_Prime
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:-");
		int n=sc.nextInt();
		if(n>100000)
			return;
		FindHungry(n);
	}
	public static void FindHungry(int n)
	{
		int c=1;
		int i=1;
		while(c<=n)
		{
			i++;
			if(isPrime(i)) {
				System.out.print(i+",");
				c++;
			}
		}
	}
	public static boolean isPrime(int n)
	{
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
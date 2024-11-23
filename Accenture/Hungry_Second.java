import java.util.*;
class Hungry_Second
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
        for(int i=n;i<=2*n-1;i++)
        {
            if(i==2*n-1)
            System.out.println(i);
            else
            System.out.print(i+",");
        }
    }
}

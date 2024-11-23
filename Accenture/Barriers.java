import java.util.*;
class Barriers
//In this program we basically are given x,y,d where a barrier extebds from x,y to (x+d),y 
//so we need to calculate how many people starting from the x axis are stopped using the barrier
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<3; i++)
		{
			list.add(new ArrayList<Integer>());
		}
		while(sc.hasNextInt())
		{
			list.get(0).add(sc.nextInt());
			list.get(1).add(sc.nextInt());
			list.get(2).add(sc.nextInt());
		}
		int row=list.get(0).size(),x1,x2,sum=0;
		int arr1[]=new int[row];
		int arr2[]=new int[row];
		for(int i=0; i<row; i++)
		{
			arr1[i]=list.get(0).get(i);
			arr2[i]=arr1[i]+list.get(2).get(i);
		}
		bubblesort(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		x1=arr1[0];
		x2=arr2[0];
		sum=x2-x1+1;
		for(int i=1; i<row; i++)
		{
			if(arr1[i]>=x2)
			{
				if(arr1[i]==x2)
					sum+=arr2[i]-arr1[i];
				else
					sum+=arr2[i]-arr1[i]+1;
				x1=arr1[i];
				if(arr2[i]>x2)
					x2=arr2[i];
			}
			else
			{
				if(arr2[i]>x2)
					sum+=arr2[i]-x2;
				else
					sum+=0;
				x1=arr1[i];
				if(arr2[i]>=x2)
					x2=arr2[i];
			}
		}
		System.out.println(sum);
	}
	public static void bubblesort(int arr1[],int arr2[])
	{
		boolean flag=false;
		for(int i=0; i<=arr1.length-2; i++)
		{
			for(int j=0; j<=arr1.length-2-i; j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					flag=true;
					swap(j,j+1,arr1);
					swap(j,j+1,arr2);
				}
			}
			if(!flag)
				break;
			flag=false;
		}
	}
	public static void swap(int i,int j, int arr1[])
	{
		int temp=arr1[i];
		arr1[i]=arr1[j];
		arr1[j]=temp;
	}
}
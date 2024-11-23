import java.util.*;
class Intersection
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of both the arrays:");
	 int n=sc.nextInt();
	 int m=sc.nextInt();
	 int arr1[]=new int[n];
	 int arr2[]=new int[m];
	 System.out.println("Enter the elements of array1:");
	 for(int i=0;i<n;i++)
	   arr1[i]=sc.nextInt();
	 System.out.println("Enter the element of the second array:");
	 for(int j=0;j<m;j++)
	   arr2[j]=sc.nextInt();
	 System.out.println("The count of the intersection of both the arrays is"+inter(arr1,arr2));	 
	}
	public static int inter(int arr1[],int arr2[])
	{
	 int count=0;
	 HashSet<Integer> set=new HashSet<>();
	 for(int i=0;i<arr1.length;i++)
	   set.add(arr1[i]);
	 System.out.println("The common elements are:");
	 for(int j=0;j<arr2.length;j++)
	  {
	   if(set.contains(arr2[j]))
	   {
	   System.out.print(arr2[j]+" ");
	   count++;
	  }
	  }
	 System.out.println(set);
	 return count;
	}
}
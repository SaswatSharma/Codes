import java.util.*;
public class BinarySearch
{	public static void main(String[]args)
	{
 	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of the array");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter the values:");
	 for(int i=0;i<n;i++)
	 {
	  arr[i]=sc.nextInt();
	 }
	 Arrays.sort(arr);
	 System.out.println("Enter the target");
 	 int target=sc.nextInt();
	 sc.close();
	 System.out.println(bs(arr,target,0,n-1));
	}
	public static int bs(int arr[],int target,int start,int end)
	{
	  int mid=start+(end-start)/2;
	  if(start>end)
	   return -1;
	  else if(arr[mid]==target)
	  {
	    return mid;
	  }
	  else if(target>arr[mid])
	  {
	   return bs(arr,target,mid+1,end);
	  }
	  else
	  {
	   return bs(arr,target,start,mid-1);
	  }
	}
}
import java.util.*;
class Perm
{
	public static void main(String[]args)
	{
	  int arr[]={1,2,3};
	  perm(arr,0);
	}
	public static void perm(int arr[],int i)
	{
	  if(i==arr.length)
	   System.out.println(Arrays.toString(arr));
	  else{
	  for(int j=i;j<arr.length;j++)
	   {
	     swap(arr,j,i);
	     perm(arr,i+1);
	     swap(arr,j,i);
	   }
	     }
	}
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
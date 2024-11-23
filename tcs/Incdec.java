import java.util.*;
class Incdec
{
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of the array:");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("Enter the elements of the array");
	  for(int i=0;i<n;i++)
	  {
	    arr[i]=sc.nextInt();
	  }
	  sort(arr);
	  System.out.println("The required arrangement of the array is:"+Arrays.toString(arr));
	}
	public static void sort(int arr[])
	{
	  ms(arr,0,(arr.length-1)/2,1);
	  ms(arr,((arr.length-1)/2)+1,arr.length-1,0);
	}
	public static void ms(int arr[],int start,int end,int key)
	{
	 if(start<end)
	 {
 	  int mid=(start+end)/2;
	  ms(arr,start,mid,key);
	  ms(arr,mid+1,end,key);
	  merge(arr,start,end,mid,key);
	 }
	}
	public static void merge(int arr[],int start,int end,int mid,int key)
	{
	  int k=-1;
	  int temparr[]=new int[end-start+1];
	  int s=start,m=mid+1;
	  while(s<=mid && m<=end)
	  {
	    if(key==1)
	    {
	    if(arr[s]>=arr[m])
	     temparr[++k]=arr[m++];
	    else
 	      temparr[++k]=arr[s++]; 
	    }
	   else
	   {
	    if(arr[s]>=arr[m])
	      temparr[++k]=arr[s++];
	    else
 	      temparr[++k]=arr[m++];
	   }
	 }
	   if(s<=mid)
	   {
	     while(s<=mid)
	     temparr[++k]=arr[s++];
	   }
	   if(m<=end)
	   {
	     while(m<=end)
	     temparr[++k]=arr[m++];
	   }
	   k=-1;
	   for(int j=start;j<=end;j++)
	      arr[j]=temparr[++k];
	  }
}

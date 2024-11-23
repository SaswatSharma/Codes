import java.util.*;
class PathNumbers
{	
	static int c=0;
	static Integer dp[][];
    static int count=0;
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of the matrix:");
	 int m=sc.nextInt();	
	 int n=sc.nextInt();
	 int arr[][]=new int[m][n];
	 System.out.println("Enter the elements of the array");
	 for(int i=0;i<m;i++)
	 {
	   for(int j=0;j<n;j++)
	    {
	      arr[i][j]=sc.nextInt();
	    }
	 }
     dp=new Integer[m][n];
	//  System.out.println("The array is:-");
	//  for(int i=0;i<m;i++)
	//  {
	//    for(int j=0;j<n;j++)
	//     {
	//       System.out.print(arr[i][j]+" ");
	//     }
	//     System.out.println();
	//  }
	 sc.close();
	 System.out.println(Arrays.deepToString(arr));
  	 System.out.println("The total paths are:"+explorePaths(arr));
	 System.out.println(Arrays.deepToString(dp));
	 System.out.println(c);
	}
	public static int totalPaths(int arr[][],int k,int l,int count)
 	{
	 count=0;
 	 if(k==arr.length || l==arr[0].length)
	  return 0;
     if(dp[k][l]!=null)
      { 
		c++;
		return dp[k][l];
	  }
 	 if(arr[k][l]==1)
	  return 0;
	 if(k==arr.length-1 && l==arr[0].length-1)
	  return 1;
	 count+=totalPaths(arr,k+1,l,count);
	 count+=totalPaths(arr,k,l+1,count);
	 return dp[k][l]=count;
	}
	public static int explorePaths(int arr[][])
	{
	  return  totalPaths(arr,0,0,0);
	}
}
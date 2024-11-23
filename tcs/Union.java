import java.util.*;
public class Union
{
   public static void main(String []args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the arrays:");
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[]=new int[n];
	int arr1[]=new int[m];
	System.out.println("Enter the elements of array1");
	for(int i=0;i<arr.length;i++)
	{
	 arr[i]=sc.nextInt();
	}
	System.out.println("Enter the elements of array2");
	for(int i=0;i<arr1.length;i++)
	{
	 arr1[i]=sc.nextInt();
	}
	System.out.println("The cardinality of union of 2 arrays are:"+cardinal(arr,arr1));
   }
   public static int cardinal(int arr[],int arr1[])
   {
	HashMap<Integer,Integer> Map=new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
	 if(Map.containsKey(arr[i]))
	 continue;
	 else
	 Map.put(arr[i],i);
	}
	for(int j=0;j<arr1.length;j++)
	{
	 if(Map.containsKey(arr1[j]))
	 continue;
	 else
	 Map.put(arr1[j],j);
	}
      System.out.println(Map);
      return Map.size();
   }
}
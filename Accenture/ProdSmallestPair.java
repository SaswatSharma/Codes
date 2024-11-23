import java.util.*;
public class ProdSmallestPair {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n=sc.nextInt();
      System.out.println("Enter the sum:");
      int sum=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements of the array:");
      for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
      System.out.println(ProductSmallestPair(sum,arr));
    }
    public static int ProductSmallestPair(int sum,int arr[])
    {
       if(arr.length<2)
       return -1;
       else{
       int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]<min || arr[i]<min2)
          {
           if(arr[i]<min)
           {min2=min;
            min=arr[i];
           }
           else
           min2=arr[i];
       }
    }
     if((min+min2)>sum)
     return -1;
     else
     return min*min2;
}}
}


import java.util.*;
public class Optimalsecondmaxmin {
    
public static int[] maxmin(int arr[],int size)
{
    int max=Integer.MIN_VALUE;
    int secondmax=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int secondmin=Integer.MAX_VALUE;
    for(int i=0;i<size;i++)
    {
      if(arr[i]>max)//If second max is before max,it will find the second max
      {
        secondmax=max;
        max=arr[i];
      }
      else if(arr[i]>secondmax && arr[i]!=max)//If second max is after max this will find it
      {
        secondmax=arr[i];
      }  
      if(arr[i]<min)//If second min is before min,it will find the second min
      {
        secondmin=min;
        min=arr[i];
      }
      else if(arr[i]<secondmin && arr[i]!=min)//If second min is after min this will find it
      {
        secondmin=arr[i];
      }    
    }
    int arr2[]=new int[2];
    arr2[0]=secondmax;
    arr2[1]=secondmin;
    return arr2;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int [] arr=new int[size];
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    int arr1[]=maxmin(arr,size);
    for(int i=0;i<2;i++)
    {
        System.out.print(arr1[i]+" ");
    }
}
}
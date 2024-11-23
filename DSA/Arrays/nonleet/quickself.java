import java.util.*;
public class quickself {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={4,8,3,1,0,9,7,4,2,8};
    System.out.println("The sorted array is:"+Arrays.toString(quick(0,arr.length-1,arr)));
}
   public static int [] quick(int low,int high,int[]arr)
   {
    if(high>low)
    {
        int pivot=partition(low,high,arr);
        quick(low,pivot-1,arr);
        quick(pivot+1,high,arr);
    }
     return arr;
   }
   public static int partition(int low,int high,int []arr)
   {
    int pivot=low;
    int s=low,e=high;
    while(s<=e)
    {
    while(arr[s]<=arr[pivot] && s<arr.length-1)
     s++;
    while(arr[e]>arr[pivot])
     e--;
    if(s<=e)
    { swap(s,e,arr);
    if(s==e)
     s++;
    else
    {
        s++;
        e--;
    } 
}
    } 
    swap(pivot,e,arr);
    return e;
   }
   public static void swap(int start,int end,int[]arr)
   {
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
   }
}

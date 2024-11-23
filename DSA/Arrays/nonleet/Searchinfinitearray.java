import java.util.*;
public class Searchinfinitearray {
  public static void main(String[] args) {
    int arr[]={2,3,5,6,7,8,10,11,12,15,20,25,30};
    int target=8;
    breakk(arr,target);
  }    
  public static void breakk(int arr[],int target)
  {
     int low=0;
     int high=1;
     int diff=0;
   // while(!(target>=arr[low] && target<=arr[high]))
     while(target>arr[high])
    {
      //low=high;
      //high=2*high;
      diff=high-low;
      low=high+1;
      high=high+2*(diff+1);
      //if(high>arr.length-1)
      //high=arr.length-1;
    }
    Search(low,high,arr,target);
  }
  public static void Search(int low,int high,int arr[],int target)
  {
    int mid=0;
    while(low<=high)
    {
       mid=low+(high-low)/2;
       if(target>arr[mid])
        low=low+1;
       else if(target<arr[mid])  
        high=mid-1;
       else{
        System.out.println("Element found ="+arr[mid]+" and at index "+mid) ;
        break;
       }
    }
  }
}

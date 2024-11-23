import java.util.*;
public class Ceiling {
    public static void main(String[] args) {
        int arr[]={2,3,7,9,14,16,18};
        int target=19;
        ceiling(arr,target);
    }
    public static void ceiling(int arr[],int target)
    {
        int mid=0;
        int low=0;
        int high=arr.length-1;
        if(target>arr[high] || target<arr[low])
         System.out.println("Not possible:");
        else{
        while(low<=high)
        {
            mid=((low+high)/2);
            if(arr[mid]==target)
            {
              System.out.println("Ceiling value is:"+arr[mid]+"\nFloor value is:"+arr[mid]);
              break;
            }
            if(arr[mid]>=target)
              high=mid-1;
            else
              low=mid+1;
        }
          if(low>high)
          //If element not found ceiling value will be pointed by low and floor by high
          {
          System.out.println("Ceiling value is:"+arr[low]+"\nFloor value is:"+arr[high]);
          }
      /*   if(arr[mid]<target)
          System.out.println("Ceiling="+arr[mid+1]);
        else
          System.out.println("Ceiling="+arr[mid]);*/
    }
}
}

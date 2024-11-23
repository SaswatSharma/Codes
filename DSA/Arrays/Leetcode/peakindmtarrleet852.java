import java.util.*;
class peakindmtarrleet852 {
    public static void main(String[] args) {
        int arr[]={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        while(low<high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1])
             high=mid;
            else
             low=mid+1;
            
        }
        return low;
    }
}
//import java.util.*;
class mountainarray1095 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3,1};
        System.out.println(findInMountainArray(3,arr));
    }
    public static int findInMountainArray(int target,int mountainArr[]) {
       int mid=0,high=mountainArr.length-1,low=0;
       while(low<high)
       {
           mid= high+(low-high)/2;
           if(mountainArr[mid+1]>mountainArr[mid])
            low=mid+1;
           else
             high=mid;
       }
       int ret=find(0,low,mountainArr,true,target);
       if(ret!=-1)
        return ret;
       else
        return find(low+1,mountainArr.length-1,mountainArr,false,target);
    }
   public static int find(int low,int high,int mountainArr[],boolean check,int target) {
       int mid=0;
       while(low<=high)
       {
           mid= high+(low-high)/2;
          if(mountainArr[mid]==target)
           return mid;
          if(check)
          {
              if(mountainArr[mid]<target)
               low=mid+1;
              else
               high=mid-1; 
          }
          else
          {
              if(mountainArr[mid]>target)
               low=mid+1;
              else
               high=mid-1; 
          }
       }
       return -1;
   }
}
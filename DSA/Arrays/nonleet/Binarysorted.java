import java.util.*;
class Binarysorted {
  public static void main(String[] args) {
    int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
    System.out.println(Arrays.toString(bstwod(arr,20)));
  }
  public static int[]bstwod(int arr[][],int target)
  {
    int rmid,rs=0, re=arr.length-1,cmid=(0+arr[0].length-1)/2;
    while(!(rs==(re-1)))
    {
       rmid=re-((re-rs)/2);
       if(arr[rmid][cmid]==target)
        return new int[] {rmid,cmid};
       else if(arr[rmid][cmid]>target)
        re=rmid;
       else
        rs=rmid; 
    }
    if(target==arr[rs][cmid])
     return new int[]{rs,cmid};
    if(target==arr[re][cmid])
     return new int[]{re,cmid};
    if(target>arr[re][cmid])
     return bs(re,cmid+1,arr[0].length-1,target,arr);
    else if(target<arr[rs][cmid])
     return bs(rs,0,cmid-1,target,arr);
    else if(target>arr[rs][cmid] && target<=arr[rs][arr[0].length-1])
     return bs(rs,cmid+1,arr[0].length-1,target,arr); 
    else
      return bs(re,0,cmid-1,target,arr); 
  }
   public static int[]bs(int row,int low,int high,int target,int[][]arr)
   {
     while(low<=high)
     {
        int mid=low+((high-low)/2); 
        if(arr[row][mid]==target)
         return new int[]{row,mid};
        else if(arr[row][mid]<target)
         low=mid+1;
        else
         high=mid-1;    
    }
      return new int[]{-1,-1};
   }
}

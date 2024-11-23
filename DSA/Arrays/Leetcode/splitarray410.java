import java.util.*;
public class splitarray410 {
    public static void main(String[] args) {
         int nums[]={7,2,5,10,8,3};
         System.out.println(splitArray(nums,3));
    }
    public static int splitArray(int[] nums, int k) {
        int i,sum=0,max=-1,mid=0;
        for(i=0;i<nums.length;i++)
        {
          sum+=nums[i];
          if(nums[i]>max)
           max=nums[i];
        }
        while(max<sum)
        {
             mid=max+(sum-max)/2;
             if(pieces(nums,mid)<=k)
              sum=mid;
             else
               max=mid+1;
            // if(max==sum)
              // break;
        }
        return sum;
      }
   public static int pieces(int nums[],int mid)
   {
    int count=1,i,sum=0;
    for(i=0;i<nums.length;i++)
    {
      sum+=nums[i];
      if(sum>mid)
       {
        count++;
       sum=nums[i];
       }
    }  
    return count;
  }
}

 
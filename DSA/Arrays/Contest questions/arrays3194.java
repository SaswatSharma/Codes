import java.util.*;
class arrays3194 {
    public static void main(String[] args) {
        int nums[]={1,9,8,3,10,5};
        float averages[]=new float[(nums.length)/2];
        ms(0,nums.length-1,nums);
        float min=(float)(nums[0]+nums[nums.length-1])/2;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<=(nums.length/2)-1;i++)
        {
            averages[i]=((float)(nums[i]+nums[nums.length-1-i]))/2;
            min=Math.min(min,averages[i]);
            System.out.println(min);
        } 
        System.out.println(Arrays.toString(averages));
       System.out.println(min);
    }
     public static void ms(int low,int high,int nums[])
     {
        if(high>low)
        {
          int mid=low+(high-low)/2;
          ms(low,mid,nums);
          ms(mid+1,high,nums);
          merge(low,high,mid,nums);
        }
     }
     public static void merge(int low,int high,int mid,int [] nums)
     {
       int c=-1;
       int arr[]=new int[high-low+1];
       int j=low,k=mid+1;
       while(j<=mid && k<=high)
       {
        if(nums[j]<=nums[k])
        {
        arr[++c]=nums[j];
        j++;
        }
        else
        {
        arr[++c]=nums[k];
        k++;
        }
       }
       if(j<=mid && k>high)
       {
        for(int i=j;i<=mid;i++)
         arr[++c]=nums[i];
       }
       if(j>mid && k<=high)
       {
        for(int i=k;i<=high;i++)
         arr[++c]=nums[i];
       }
       c=-1;
       for(int i=low;i<=high;i++)
        nums[i]=arr[++c];
      System.out.println(Arrays.toString(nums));
     }
}
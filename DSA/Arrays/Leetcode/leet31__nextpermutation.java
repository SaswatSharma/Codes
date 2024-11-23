import java.util.*;
public class leet31__nextpermutation {
    //Solution is same just needs to get more organised
    //Here sorting is what that's making the program more complex ;only reversal program is required
    public static void nextPermutation(int[] nums)
    {  boolean flag=false;
         Outer:
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            { 
                for(int j=nums.length-1;j>i;j--)
                {
                    if(nums[j]>nums[i])
                    {
                        swap(j,i,nums);
                        quickasc(nums,nums.length-1,i+1);
                        flag=true;
                        break Outer;
                    }
                }
        
            }
        }
        if(flag)
        System.out.println(Arrays.toString(nums));
        else
        {
            quickasc(nums,nums.length-1,0);
            System.out.println(Arrays.toString(nums));
        }

    }
    public static void quickasc(int arr[],int high,int low)
    {
        if(high>low)
        {
            int ele=arr[low];
            int pivot=parttition(arr,ele,high,low);
            quickasc(arr,pivot-1,low);
            quickasc(arr,high,pivot+1);
        }
    }
    public static int parttition(int arr[],int ele,int high,int low)
    {
        int i=low,j=high;
        while(i<=j)
        {
        while(arr[i]<=ele && i<arr.length-1)
         i++;
        while(arr[j]>ele)
         j--;
        if(i<=j)
        {
            swap(i,j,arr);
            if(i==j)
             i++;
            else
            { 
            i++;
            j--;
            }
        }  
        swap(low,j,arr);
        }
        return j;
    }
   /*  public static void quickdsc(int arr[],int high,int low)
    {
        if(high>low)
        {
            int ele=arr[low];
            int pivot=partition(arr,ele,high,low);
            quickdsc(arr,pivot-1,low);
            quickdsc(arr,high,pivot+1);
        
        }
    }
    public static int partition(int arr[],int ele,int high,int low)
    {
        int i=low,j=high;
        while(i<=j)
        {
        while(arr[i]>=ele && i<arr.length-1)
         i++;
        while(arr[j]<ele)
         j--;
        if(i<=j)
        {
            swap(i,j,arr);
            if(i==j)
             i++;
            else
            { 
            i++;
            j--;
            }
        }  
        swap(low,j,arr);
        }
        return j;
    }*/
    public static void swap(int low,int j,int[] nums)
    {
        int temp=nums[low];
        nums[low]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int nums[]={4,2,0,1,3,2,0};
        nextPermutation(nums);
    }
}

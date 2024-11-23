class Solution {
    public void sortColors(int[] nums) {
        quick(nums, 0, nums.length - 1);
    }

    public void quick(int[] nums, int low, int high) {
        if(high>low)
        {
        int pivot = partition(nums, low, high);
        quick(nums, low, pivot-1);
        quick(nums, pivot + 1, high);
        }
    }

    public int  partition(int[]nums,int low,int high)
    {
        int i=low,j=high;
        int ele=nums[low];
        while(j>=i)
        {
        while(i<nums.length && nums[i]<=ele )
        i++;
        while(nums[j]>ele)
        j--;
        if(j>=i)
        {
        swap(nums,i,j);
        if(j==i)
        i++;
        else
        {
            i++;
            j--;
        }
        }
        }
        swap(nums,low,j);
        return j;

    }

    public void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}
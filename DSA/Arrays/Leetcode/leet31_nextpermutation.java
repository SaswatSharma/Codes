import java.util.*;
class leet31_nextpermutation {
        public static void nextPermutation(int[] nums) {
            boolean flag=false;
            int i;
            Outerloop:
            for(i=nums.length-1;i>=0;i--)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(nums[i]>nums[j])
                    {
                        swap(i,j,nums);
                        flag=true;
                        break Outerloop;
                    }
                }
            }
            if(!flag)
               sortasnd(i+1,nums);
            else
               sortasnd(i,nums);
        }
        public static void swap(int i,int j,int[]nums)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public static void main(String[] args) {
            int nums[]={5,4,3,2,1};
            nextPermutation(nums);
        }
        public static void sortasnd(int k,int nums[])
        {
            for(int i=nums.length-1;i>k;i--)
            {
                for(int j=i-1;j>=k;j--)
                {
                    if(nums[i]<nums[j])
                    {
                        swap(i,j,nums);
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
    

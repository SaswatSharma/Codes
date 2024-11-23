public class leetcode_33duplicate {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
      }
      public static int search(int[] nums, int target) {
          int max=-1,tarind=-1;
         /*  if (nums.length==1){
           if(nums[0]==target)
            return 0;
           else
             return -1;
          }
          else*/
          //{
            max=peak(nums);
            System.out.println(max);
            if(max==-1)
              return bs(nums, 0, nums.length-1, target);
            else
            {
            tarind=bs(nums, 0, max, target);   
            if(tarind!=-1)
             return tarind;
            else
              return bs(nums,max+1,nums.length-1,target); 
         // }
            }
      }
      public static int peak(int [] nums)
      {
          int low=0,high=nums.length-1,mid=0;
          while(low<=high)
          {
              mid=low+(high-low)/2;
              if((mid+1)<=nums.length-1 && nums[mid]>nums[mid+1] )
               return mid;
              else if(nums[low]==nums[mid] && nums[mid]==nums[high])
              {
                if(nums[low]>nums[low+1])
                 return low;
                 low++;
                if(nums[high]<nums[high-1])
                 return high-1;
                 high--; 
              }
              else
              {
                  if(nums[mid]<nums[low])
                   high=mid-1;
                  else
                  low=mid+1; 
              } 
              
          }
          return -1;//If -1 gets returned that means array is sorted;
       }
      public static int bs(int []nums,int low,int high,int target)
      {
          int mid=-1;
         while(low<=high)
          {
            mid=low+(high-low)/2; 
            if(nums[mid]<target)  
               low=mid+1;
            else
              high=mid-1;   
          }
          if(nums[low]==target)
          return low;
          else
          return -1;
      }
}

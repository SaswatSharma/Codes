package kadanesalgo;
public class kdnOn 
{
        public static int maxSubArray(int[] nums) {
            int max = nums[0];
            int sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (sum >= 0)
                    sum+= nums[i];
                else {
                    if (nums[i] > sum)
                        sum = 0;
                    sum+= nums[i];
                }
                if(sum>max)
                 max=sum;
            }
            return max;
        }
        public static void main(String[] args) {
            int nums[]={-2,1,-3,4,-1,2,1,-2,1,-5,4};
            System.out.println(maxSubArray(nums));
        }
    }

package leet744;
import java.util.*;

public class leet53kadanesalgo {
    public static void main(String[] args) {
        int nums[] = { 5, 4, -1, 7, 8 };
        System.out.println(findmaxsub(nums));
    }

    public static int findmaxsub(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max)
                    max = sum;
            }
            sum = 0;
        }
        return max;
    }
}

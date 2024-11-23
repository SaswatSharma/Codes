import java.util.*;

public class enhancedleet31 {
    public static void main(String[] args) {
        int nums[] = { 3,2,1 };
        int peakind = peak(nums);
        if (peakind != -1)
            swapsmaller(nums, peak(nums));
        reverse(nums, peakind);
        System.out.println(Arrays.toString(nums));

    }

    public static int peak(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1])
                return i - 1;
        }
        return -1;
    }

    public static void swapsmaller(int nums[], int peak) {
        int n = nums.length - 1;
        while (n > peak) {
            if (nums[n] > nums[peak]) {
                swap(nums, n, peak);
                return;
            }
            n--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int peak) {
        int i = peak + 1;
        int j = nums.length - 1;
        while (i != j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}

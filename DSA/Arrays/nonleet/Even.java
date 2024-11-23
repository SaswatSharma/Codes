import java.util.*;
//leetcode 1295
class Even {
    public static int findNumbers(int[] nums) {
        int a=0;
        String b;
        for(int i=0;i<nums.length;i++)
        {
            b=Integer.toString(nums[i]);
            if((b.length()) % 2==0)
               a++;
        }
        return a;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int []nums=new int[500];
        for(int i=0;i<4;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(findNumbers(nums));
    }
}
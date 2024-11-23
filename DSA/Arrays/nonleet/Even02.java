import java.util.*;
class Even02 {
    public static int count(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            if(digitcount(i)%2==0)
                c++;
        }
        return c;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int []nums=new int[4];
        for(int i=0;i<4;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(count(nums));
    }
    public static int digitcount(int num)
    {
        int c=0;
        while(num!=0)
        {
             num/=10;
             c++;
        }
        return c;
    }
}
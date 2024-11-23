import java.util.*;
public class CakeVerticalCuts {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of cuts:");
        int n=sc.nextInt();
        System.out.println(max(n));
    }
    public static int max(int n)
    {
        long total=1;
        for(int i=1;i<=n;i++)
        {
            total+=i;
            if(total>=1000000007)
            total%=1000000007;
        }
        return (int)total;
    }
}

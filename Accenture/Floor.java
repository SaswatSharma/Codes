import java.util.*;
public class Floor {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(findfloor(n));
    }
    public static int findfloor(int n)
    {
        while(n>=10 || n<=-10)
        {
        {
            if(n%2!=0)
               n=(int)Math.floor(n/2);
            else
               n=(int)Math.floor((n-2)/2);     
        }
    }
    return n;
    }
}

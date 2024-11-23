import java.util.*;
public class DectoNbase {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println((char)(65));
        System.out.println("Enter the base:");
        int b=sc.nextInt();
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(DecToNBAse(n,b));
    }
    public static String DecToNBAse(int n,int b)
    {
        int rem=0;
        StringBuilder sb=new StringBuilder();
        while(n!=0)
        {
           rem=n%b;
           if(rem<10)
           sb.insert(0,rem);
           else
           sb.insert(0,(char)(55+rem));
           n/=b;
        }
        return(sb.toString());
    }
}

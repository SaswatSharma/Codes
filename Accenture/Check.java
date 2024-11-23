import java.util.*;
public class Check {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        System.out.println(Checkpassword(sc.next(),5));
    }
    public static int Checkpassword(String A,int n)
    {
        int f1=0,f2=0,f3=0;
        if(A.length()<4 || (Character.isDigit(A.charAt(0))))
         return 0;
        else
         {
             for(int i=0;i<A.length();i++)
             {
                if(Character.isDigit(A.charAt(i)))
                 f1++;
                if(A.charAt(i)>=65 && A.charAt(i)<=90) 
                 f2++;
                if(A.charAt(i)==' ' || A.charAt(i)=='/') 
                 return 0;
             }
             if(f1!=0 && f2!=0)
             return 1;
             else 
             return 0;

         }
    }
}

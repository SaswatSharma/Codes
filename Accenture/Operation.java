import java.util.*;
public class Operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String A =sc.next();
        System.out.println(OperationsBinaryString(A));
        }
    public static int OperationsBinaryString(String A)
    {
      if(A.length()==0)
      return -1;
      int result=A.charAt(0)-'0';
      for(int i=1;i<A.length();i=i+2)
      {
         if(A.charAt(i)=='A')
         result=result&(A.charAt(i+1)-'0');
         if(A.charAt(i)=='B')
         result=result|(A.charAt(i+1)-'0');
         if(A.charAt(i)=='C')
         result=result^(A.charAt(i+1)-'0');
      }
      return result;
    }
    // public static char and(char first, char second)
    // {
    //     if(first=='1'&& second=='0')
    //     return '0';
    //     if(first=='0'&& second=='0')
    //     return '0';
    //     if(first=='1'&& second=='1')
    //     return '1';
    //     return '0';
    // }
    // public static char or(char first, char second)
    // {
    //     if(first=='1'&& second=='0')
    //     return '1';
    //     if(first=='0'&& second=='0')
    //     return '0';
    //     if(first=='1'&& second=='1')
    //     return '1';
    //     return '1';
    // }
    // public static char xor(char first, char second)
    // {
    //     if(first=='1'&& second=='0')
    //     return '1';
    //     if(first=='0'&& second=='0')
    //     return '0';
    //     if(first=='1'&& second=='1')
    //     return '0';
    //     return '1';
    // }
}

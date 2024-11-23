import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String You Want to find longest Palindrome Of:");
        String s = sc.next();
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s)
    { 
        int len,start=0,end=0;
        for(int i=0;i<s.length();i++)
       { 
        len=Math.max(expand(i,i,s),expand(i,i+1,s));
        if(len>(end-start+1))
        {
            start=i-((len-1)/2);
            end=i+(len/2);
        }
    }
       return s.substring(start,end+1);
    }

    public static int expand(int left, int right, String s) {
     while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
     {
        left--;
        right++;
     }
     return ((right-1)-(left+1)+1);
    }
}

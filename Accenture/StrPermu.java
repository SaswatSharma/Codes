import java.util.*;
public class StrPermu {
    public static int c=0;
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String b=sc.next();
        // Integer c=0;
        StringBuilder A=new StringBuilder(b);
        ms(A,0,A.length()-1);
        System.out.println(Perm(A,0));
    }
    public static int Perm(StringBuilder A,int i)
    {
        //Integer c is not getting updated because Integer c is a immutable object ,so a new object gets created everytime we alter the value of c,so the original reference does not change rather a new object gets created,but the local object to that recursive call is returned;the solution is to make a global variable and it will update every time a change happens.
        // int d=6;.
        int j;
        if(i==A.length()){
            c++;
            System.out.println(A.toString());
            // System.out.println(c);
        }
         for(j=i;j<A.length();j++)
         {
            Swap(A,i,j);
            Perm(A,(i+1));
            Swap(A,i,j);//backtracking
         }
         return c;
    }
    public static void Swap(StringBuilder A,int i,int j)
    {
        char temp=A.charAt(i);
        A.setCharAt(i,A.charAt(j));
        A.setCharAt(j,temp);
    }
    public static void ms(StringBuilder A,int s,int e)
    {
      if(s<e)
      {
        int mid=(s+e)/2;
        ms(A,s,mid);
        ms(A,mid+1,e);
        merge(A,s,mid,e);
      }
    }
    public static void merge(StringBuilder A,int s,int mid,int e)
    {
        StringBuilder B=new StringBuilder("");
        int i=s,j=mid+1;
        while(i<=mid && j<=e)
        {
            if(A.charAt(i)<=A.charAt(j))
            {B.append(A.charAt(i));i++;}
            else
            {B.append(A.charAt(j));j++;}
        }
        if(j>e)
        {
            for(int k=i;k<=mid;k++)
                B.append(A.charAt(k));
        }
        if(i>mid)
        {
            for(int k=j;k<=e;k++)
                B.append(A.charAt(k));
        }
        int s1=s;
        for(int k=0;k<(e-s+1);k++)
        {
            A.setCharAt(s1,B.charAt(k));
            s1++;
        }
        }
    }

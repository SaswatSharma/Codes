
//In this program we need to divide divide similar mangoes among similar people.(for example 
//if we are said to divide 2 mangoes among 2 people then the output will be 3 because{(1,1) ,
//(2,0) ,(0,2)}
import java.util.*;
class MangoesandPeople
{
    static int c=0;
	public static void main(String [] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int m,p;
	 m=sc.nextInt();
	 p=sc.nextInt();
	 sc.close();
	 Integer dp[][]=new Integer[m+1][p+1];
	 System.out.println(solve(m,p,dp));
    //  System.out.println(c);
	}
	private static int solve(int m,int p,Integer[][]dp)
	{
    //   c++;//counting how many times solve() is called
	 if(p==0)
	 return (m==0)?1:0;//if p=0 and m!=0 that way doesn't count and if p & m both=0 then
//it counts;
	 if(dp[m][p]!=null)
	 return dp[m][p];
	 int ways=0;
	 //for every postion checking every possible no.
	 for(int i=m;i>=0;i--)
	 {
    //   if(p>0)  
    // //   System.out.print(i+",");
    //   if(p==1)
    //   System.out.println();
	  ways+=solve(m-i,p-1,dp);
	 }
	 return dp[m][p]=ways;	
	}
}
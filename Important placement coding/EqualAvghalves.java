//In this program we need to divide the array in two halves such that the average of both //the halves are equal and each number in the array in even.
import java.util.*;
public class EqualAvghalves
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 ArrayList<Integer> list=new ArrayList<>();
	 int element;
	 while(sc.hasNextInt())
	 {
	  element=sc.nextInt();
	  if((element%2)!=0)
	  {
	      System.out.println("-1");
	      System.exit(0);
	  }
	  else
	  list.add(element);
	 }
	 divide(list);
	}
	public static void divide(ArrayList<Integer> list)
	{
	 double sum=0.0,sum1=0.0;
	 int i=0;
	 int size=list.size();
	 for(i=0;i<size;i++)
	 {
 	   sum+=list.get(i);
	 }
	 for(i=0;i<size-1;i++)
	 {
	   sum1+=list.get(i);
	   if(sum1/(i+1.0)==(sum-sum1)/(size-(i+1.0)))
	   {
		int half1[]=new int[i+1];
		int half2[]=new int[size-(i+1)];
		int j,k;
		for(j=0,k=0;j<size;j++)
		{
		 if(j>i)
		 half2[k++]=list.get(j);
		 else
		 half1[j]=list.get(j);
		}
		System.out.println(Arrays.toString(half1));
		System.out.println(Arrays.toString(half2));
		return;
	   }
	   }
	   System.out.println("-1");
	 }
}
import java.util.*;
class NextSmallestUsingStack
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 ArrayList<Integer> list=new ArrayList<>();
	 System.out.println("Enter the elements in the list:");
	 while(sc.hasNextInt())
	 {
	  list.add(sc.nextInt());
	 }
	 System.out.println(Arrays.toString(RightSmaller(list)));
	}
	public static int[] RightSmaller(ArrayList<Integer> list)
	{
	 int top=-1;
	 if(list.size()==0 || list==null)
	 return null;
	 ArrayList<Integer> stack=new ArrayList<>();
	 int newArr[]=new int[list.size()];
	 for(int i=list.size()-1;i>=0;i--)
	 {
 	  top=-1;
	  if(i==list.size()-1)
	  {newArr[i]=-1;
	   stack.add(list.get(i));
	   top++;  
	  }
	  else
	  {
	   newArr[i]=findmin(list,stack,i);
	  }
	 }
	    return newArr;
	}
	 public static int findmin(ArrayList<Integer> list,ArrayList<Integer> stack,int i)
	 {
	  int top=stack.size()-1,min=-1;
	  while(top!=-1 && stack.get(top)>=list.get(i))
	  {
	    top--;
	  }
	  if(top==-1)
	  return -1;
	  min=stack.get(top);
	  stack.add(list.get(i));
	  top++;
	  return min;
	 }
	} 
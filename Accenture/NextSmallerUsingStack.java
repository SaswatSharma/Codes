import java.util.*;
class NextSmallerInbuiltStack
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
	 if(list.size()==0 || list==null)
	 return null;
	 Stack<Integer> stack=new Stack<>();
	 int newArr[]=new int[list.size()];
	 for(int i=list.size()-1;i>=0;i--)
	 {
	  if(i==list.size()-1)
	  {newArr[i]=-1;
	   stack.push(list.get(i));  
	  }
	  else
	  {
	   newArr[i]=findmin(list,stack,i);
	  }
	 }
	 System.out.println(stack);
	    return newArr;
	}
	 public static int findmin(ArrayList<Integer> list,Stack<Integer> stack,int i)
	 {
	  int min=-1;
	  while((stack.size()-1)!=-1 && stack.peek()>=list.get(i))
	  {
	    stack.pop();
	  }
	  if((stack.size()-1)==-1)
	  return -1;
	  min=stack.peek();
	  stack.push(list.get(i));
	  return min;
	 }
	} 
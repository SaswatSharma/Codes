import java.util.*;
public class Arraylist2D
{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    for(int i=0;i<3;i++)
    {
      list.add(new ArrayList<>());
    }
    System.out.println("Enter the elements of the list:");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
         list.get(i).add(sc.nextInt());
      }
    }
    System.out.println(list);
   }
}
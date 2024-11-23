import java.util.*;
public class Arraylistt1D
{

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("Enter the element which u want to search for:");
        int ser=sc.nextInt();
        System.out.println("Element present-"+list.contains(ser));
        System.out.println("Enter the index of the element which you want to remove:");
        int rem=sc.nextInt();
        list.remove(rem);
        System.out.println(list);
        System.out.println("Ente the index and the element which you want to set:");
        int in=sc.nextInt();
        int ele=sc.nextInt();
        list.set(in,ele);
        System.out.println(list);
    }
}
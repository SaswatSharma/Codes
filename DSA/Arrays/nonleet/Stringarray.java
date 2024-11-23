import java.util.*;
class Stringarray
{
   public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    String arr[]=new String[5];
    for(int i=0;i<5;i++)
    {
        arr[i]=sc.next();
    }
    System.out.println(Arrays.toString(arr));
   }
}

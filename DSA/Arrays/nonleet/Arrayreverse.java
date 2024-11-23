import java.util.*;
public class Arrayreverse {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
    int [] arr=new int[size];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("The original array is:"+Arrays.toString(arr));
    System.out.println("The reversed array is:");
    for(int i=(size-1);i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
  }    
}

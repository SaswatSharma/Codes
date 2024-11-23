import java.util.*;

public class Superior {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements of the array:");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println( FindNumberOfSuperiorElements(arr,n));
    }

    public static int FindNumberOfSuperiorElements(int arr[], int n) {
        int i, j, count = 0, flag = 0;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = (i + 1); j < arr.length; j++) {
                if (arr[i] > arr[j])
                    flag = 1;
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                count++;

        }
        return count + 1;
    }
}

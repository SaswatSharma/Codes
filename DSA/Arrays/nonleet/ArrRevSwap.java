import java.util.*;
public class ArrRevSwap
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrRevSwap ob=new ArrRevSwap();
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter  the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The original Array is:"+Arrays.toString(arr));
        for(int i=0;i<((size-1)/2);i++)
        {
            ob.swap(arr,i,(size-1-i));
        }
        System.out.println("The reversed array is:"+Arrays.toString(arr));
    }
    void swap(int arr[],int l,int u)
    {
        arr[l]=arr[u]+arr[l];
        arr[u]=arr[l]-arr[u];
        arr[l]=arr[l]-arr[u];
    }
}
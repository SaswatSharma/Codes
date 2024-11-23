import java.util.*;
class Rat{
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the value of r,unit");
       int r=sc.nextInt();
       int unit=sc.nextInt();
       System.out.println("Enter the elements of the array:");
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
       System.out.println(food(r,arr,unit));
    }
    public static int food(int r,int arr[],int unit)
    {
        if(arr.length==0)
        return -1;
        int i,sum=0,diet=r*unit;
        for(i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>=diet)
            break;
        }
        if(i<arr.length)
        return (i+1);
        else
        return 0;
    }
}
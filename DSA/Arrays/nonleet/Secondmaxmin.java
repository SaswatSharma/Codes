import java.util.*;
public class Secondmaxmin {
    public static int[] getSecondOrderElements(int size, int []arr) {
       int max=arr[0];
       int min=arr[0];
       int maxind=0;
       int minind=0;
       for(int i=1;i<size;i++)
       {
         if(arr[i]>max){
         max=arr[i];
         maxind=i;
         }
         if(min>arr[i]){
         min=arr[i];
         minind=i;
         }
       }
       max=-9999;
       min=9999;
       for(int i=0;i<size;i++)
       {
         if(i==maxind || i==minind)
         {
           continue;
         }
         if(max<arr[i]){
         max=arr[i];
         }
         if(min>arr[i]){
         min=arr[i];
         }
       }
       int[] arr1=new int[2];
       arr1[0]=max;
       arr1[1]=min;
       return arr1;
        }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int [] arr=new int[size];
      for(int i=0;i<size;i++)
      {
          arr[i]=sc.nextInt();
      }
      int [] arr1=new int[2];
      arr1=getSecondOrderElements(size,arr);
      System.out.print(arr1[0]+" "+arr1[1]);
    }
}
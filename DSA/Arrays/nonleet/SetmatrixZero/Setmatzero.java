import java.util.*;
public class Setmatzero
{
     static int r, c;
     static int arr[][];
     public static void main(String [] args) 
     {
        Scanner sc= new Scanner(System.in);
        int i,j;
        System.out.println("Enter the no. of rows and columns:");
        r=sc.nextInt();
        c=sc.nextInt();
        arr=new int[r][c];
        ArrayList <Integer> list=new ArrayList<>();
        ArrayList <Integer> list1=new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for(i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original matrix is:");
        for( i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for( i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(arr[i][j]==0)
                {
                    list.add(i);
                    list1.add(j);
                }
            }
        }
        for(i=0;i<list.size();i++)
        {
           zeromaker(list.get(i),list1.get(i));
        }

        System.out.println("The zero matrix is:");
        for( i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }

     public static void zeromaker(int i,int j)
     {
        int k;
        for(k=0;k<c;k++)
        {
           arr[i][k]=0;
        }
        for(k=0;k<r;k++)
        {
            arr[k][j]=0;
        }
     }
}
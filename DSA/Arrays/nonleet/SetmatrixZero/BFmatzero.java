import java.util.*;
class BFmatzero
//leetcode 73 using bruteforce
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns:");
        int r,c,i,j;
        r=sc.nextInt();
        c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int k;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(k=0;k<r;k++)
                    {
                        if(matrix[k][j]!=0)
                        {
                            matrix[k][j]=-1;
                        }
                    }
                    for(k=0;k<c;k++)
                    {
                        if(matrix[i][k]!=0)
                        {
                            matrix[i][k]=-1;
                        }
                    }
                }
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println("The required matrix is:");
         for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
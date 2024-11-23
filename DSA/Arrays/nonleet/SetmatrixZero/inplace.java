import java.util.*;
public class inplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns:");
        int r,c,i,j;
        r=sc.nextInt();
        c=sc.nextInt();
        int col=1;
        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements")
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
            {
                if(j!=0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
                else
                {
                   col=0;
                   matrix[i][0]=0;
                }
            }
            }
        }
        for(i=1;i<r;i++)
        {
            for(j=1;j<c;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(j=0;j<c;j++)
        {
            if(matrix[0][j]==0 || matrix[0][0]==0)
            matrix[0][j]=0;
        }
        for(i=0;i<r;i++)
        {
            if(col==0 || matrix[i][0]==0)
            matrix[i][0]=0;
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

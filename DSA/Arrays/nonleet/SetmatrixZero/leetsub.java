import java.util.Arrays;
class Solution {
    public void setZeroes(int[][] matrix) {
        int i,j,col=1;
         for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[i].length;j++)
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
        for(i=1;i<matrix.length;i++)
        {
            for(j=1;j<matrix[i].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(j=0;j<matrix[0].length;j++)
        {
            if(matrix[0][j]==0 || matrix[0][0]==0)
            matrix[0][j]=0;
        }
        for(i=0;i<matrix.length;i++)
        {
            if(col==0 || matrix[i][0]==0)
            matrix[i][0]=0;
        }
}
     public static void main(String[] args) {
        
     }
}
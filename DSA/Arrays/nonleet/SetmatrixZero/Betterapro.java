package SetmatrixZero;

import java.util.*;

public class Betterapro {
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
        
 }
}

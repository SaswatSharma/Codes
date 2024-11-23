import java.util.*;
class Transpose
{
    int size;
    int mat[][];
    Scanner in=new Scanner(System.in);
    Transpose(int x)
    {
        size=x;
        mat=new int[size][size];
    }
    void input()
    {
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
    }
    void transposeMat(Transpose A)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                mat[i][j]=A.mat[j][i];
            }
        }
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int m= in.nextInt();
        Transpose X=new Transpose(m);
        Transpose Y=new Transpose(m);
        X.input();
        Y.transposeMat(X);
        System.out.println("The original matrix is");
        X.display();
        System.out.println("The Transposed Matrix is");
        Y.display();
    }
}


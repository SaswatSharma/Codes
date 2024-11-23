
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Zeromat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println("The original matrix is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        zero(arr);
    }

    public static void zero(int arr[][]) {
        int i, j;
        int c = 1;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    if (i == 0) {
                        c = 0;
                        if (j == 0)
                            arr[0][0] = 0;
                    } else {
                        arr[i][0] = 0;
                        arr[0][j] = 0;
                    }
                }
            } 
        }
            System.out.println("The indicator matrix is:");
            for(i=0;i<arr.length;i++)
             {
             for(j=0;j<arr[i].length;j++)
             {
                System.out.print(arr[i][j]);
              }
             System.out.println();
             }

            for (i = 1; i < arr.length; i++) {
                for (j = 1; j < arr[i].length; j++) {
                    if (arr[i][0] == 0 || arr[0][j] == 0)
                        arr[i][j] = 0;
                }
            }

            if (arr[0][0] == 0) {
                for (i = 0; i < arr.length; i++)
                    arr[i][0] = 0;
            }
            if (c == 0) {
                for (j = 0; j < arr[0].length; j++)
                    arr[0][j] = 0;
            }
        
            System.out.println("The zero matrix is");
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j]);
                System.out.println();
            }
        }
    }

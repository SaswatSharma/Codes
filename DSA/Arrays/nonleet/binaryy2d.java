import java.util.*;
class binaryy2d
{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(search(arr,16)));
    }
    static int [] search(int arr[][],int target)
    {
        int r=0,c=arr[0].length-1;
        while(r<=arr.length-1 && c>=0)
        {
            if(arr[r][c]==target)
             return new int[]{r,c};
            else if (arr[r][c]<target) 
                r++;
            else
                c--;    
        }
         return new int[]{-1,-1};
    }
}
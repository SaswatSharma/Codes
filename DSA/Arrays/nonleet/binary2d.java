import java.util.*;
public class binary2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int row=0,col=3,ll,ul,mid,c=0;
        l1:while(col>=0 && row<=3)
        {
          ll=0;
          ul=col;
          while(ll<=ul)
          {
            mid=ll+(ul-ll)/2;
            if(arr[row][mid]==target)
            {
                c=1;
                System.out.println("Element found at row:"+row+" and column:"+mid);
                break l1;
            }
            else if(arr[row][mid]>target)
            {
                col=mid-1;
                ul=mid-1;
            }
            else
            {
                ll=mid+1;
            }
          }
          row++;
        }
        if(c==0)
            System.out.println("Element not found in the array");
    }
}

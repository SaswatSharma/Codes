import java.util.*;
public class Allpermutation {
    public static void main(String[] args) {
        int num[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        System.out.println(allpermu(num,0,ans));
    }
    public static List<List<Integer>> allpermu(int[]nums,int index,List<List<Integer>> ans)
    {
      if(index==nums.length)
      {
        List<Integer> ds=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
          ds.add(nums[i]);
        }
        ans.add(new ArrayList<>(ds));
      }
      else
      {
        for(int j=index;j<nums.length;j++)
        {

          swap(index,j,nums);
          allpermu(nums,index+1,ans);
          swap(index,j,nums);//for backtracking i.e for again changing back nums to what it originally was
        }
      }
      return ans;
    }
    public static void swap(int index,int j,int []nums)
    {
      int temp;
      temp=nums[index];
      nums[index]=nums[j];
      nums[j]=temp;
    }
}

import java.util.*;
//leetcode 1672
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int[] i:accounts)
        {
            for(int j:i)
            {
              sum+=j;
            }
            if(sum>max)
                max=sum;
            sum=0;     
        }
        return max;
    }
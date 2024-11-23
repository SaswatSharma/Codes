class Solution {
    public char nextGreatestLetter(char[] letters, char target)
    {
        int mid=0;
        int low=0;
        int high=letters.length-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(letters[mid]>target)
              high=mid-1;
            else
              low=mid+1;
        }
        return low % (letters.length-1);
    }
}
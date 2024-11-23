class leet744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0,h=letters.length-1,mid=0;
        if(target>=letters[h])
         return letters[0];
        else
        { 
        while(h>=l)
        {
            mid=(l+h)/2;
            if(letters[mid]==target)
            {
              if(letters[mid+1]!=target)
              return letters[mid+1];   
              else
              {
                  while(letters[mid+1]==target)
                     mid+=1;
                  return letters[mid+1];
              }
            }  
            else if(letters[mid]<target)       
              l=mid+1;
            else
              h=mid-1;
        }
         return letters[l];
    }
}
}
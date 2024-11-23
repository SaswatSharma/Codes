import java.util.*;

public class leet73_PascalsTriangle {
      public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();// ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int i,j;
        for(i=0;i<numRows;i++)
        {
            list.add(new ArrayList<>());
        }
        for(i=0;i<numRows;i++)
        {
            for(j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                 list.get(i).add(1);
                else
                 list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
        }
        return list;
    }
     public static void main(String[] args) {
        System.out.println(generate(8));
     }
}

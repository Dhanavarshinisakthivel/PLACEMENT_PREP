class Solution {
    public boolean checkStraightLine(int[][] a) 
    {
         int f=-1;
         for(int i=0;i<a.length;i++)
         {
            if(((a[0][0]-a[1][0])*(a[i][1]-a[1][1]))!=((a[0][1]-a[1][1])*(a[i][0]-a[1][0])))
            {
            f=0;
            break;
            }
         }
         return f==-1;
    }
 }
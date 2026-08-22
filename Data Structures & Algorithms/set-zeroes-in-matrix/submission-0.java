class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
         int m=matrix[0].length;
        boolean[] zeroR=new boolean[n];
        boolean[] zeroC=new boolean[m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if( matrix[i][j]==0)
               {
                  zeroR[i]=true;
                  zeroC[j]=true;
               }
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if( zeroR[i]||zeroC[j])
               {
                   matrix[i][j]=0;
               }
            }
        }
        
    }
}

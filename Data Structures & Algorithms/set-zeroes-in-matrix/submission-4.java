class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;
        int n=matrix.length;
        boolean[] zerR=new boolean[r];
         boolean[] zerC=new boolean[c];
         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    zerR[i]=true;
                    zerC[j]=true;
                }
            }
         }
          for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                if(zerR[i]||zerC[j])
                {
                   matrix[i][j]=0;
                }
            }
         }

        
    }
}

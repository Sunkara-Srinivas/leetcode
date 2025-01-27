class Solution {
    public void setZeroes(int[][] matrix) {
        int i,j,n=matrix.length,m=matrix[0].length;
        int [][] nums=new int[n][m];
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                nums[i][j]=matrix[i][j];
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++) //size
            {
                if(nums[i][j]==0)
                {
                    changeArray( matrix,i,m);
                   
                   changeCol(matrix,j,n);
                  
                }
                
            }
        }
    }
    public void changeArray(int [][]arr,int start,int size)
    {
        for(int j=0;j<size;j++)
            arr[start][j]=0;
    }
    public void changeCol(int [][]arr,int start,int size)
    {
        int i;
         //System.out.println(starti);
         
        for(i=0;i<size;i++)
        {
           
            if(i<arr.length && start<arr[i].length)
           arr[i][start]=0;
        //  System.out.println(arr[i]);
        }
    }
}
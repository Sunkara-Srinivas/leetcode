class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int left ,right;
        for(int i=0;i<image[0].length;i++)
        {
            left=0;
            right=image[0].length;
            while(left<right)
            {
                int temp=image[i][left];
                image[i][left]=image[i][right-1];
                image[i][right-1]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<image[0].length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else
                {
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
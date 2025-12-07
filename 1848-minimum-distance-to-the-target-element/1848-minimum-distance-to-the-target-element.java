class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int k;
        int min = Integer.MAX_VALUE;
          int minabs=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                k=Math.abs(i-start);
                if(k<minabs)
                {
                    minabs=k;
                }
            }
        }
        return minabs ;
    }
}
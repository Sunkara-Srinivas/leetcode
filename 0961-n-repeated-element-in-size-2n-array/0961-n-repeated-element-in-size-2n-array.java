class Solution {
    public int repeatedNTimes(int[] nums) {
       int c=0,n;
       for(int i=0;i<nums.length;i++)
       {
        int k=1;
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                k++;
            }
        }
        if(k==nums.length/2)
        {
            c=c+nums[i];
            return nums[i];
        }
       } 
       return c;
    }
}
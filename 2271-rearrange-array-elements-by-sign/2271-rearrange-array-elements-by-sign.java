class Solution {
    public int[] rearrangeArray(int[] nums) {
       int p=0,ni=1,n=nums.length,i;
       int []arr=new int[n]; 
       for(i=0;i<n;i++)
       {
        if(nums[i]>0)
        {
            arr[p]=nums[i];
            p=p+2;
        }
        else
        {
            arr[ni]=nums[i];
            ni=ni+2;
        }
       }
       return arr;
    }
}
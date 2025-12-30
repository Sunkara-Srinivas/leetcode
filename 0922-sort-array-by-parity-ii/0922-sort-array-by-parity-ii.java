class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int []odd=new int [nums.length/2];
       int []even=new int [nums.length/2];
       int oc=0,ec=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]%2==0)
        {
            even[ec]=nums[i];
            ec++;
        }
        else
        {
            odd[oc]=nums[i];
            oc++;
        }
       } 
       int j=0,k=0;
       for(int i=0;i<nums.length;i++)
       {
        if(i%2==0)
        {
            nums[i]=even[j];
            j++;
        }
        else
        {
            nums[i]=odd[k];
            k++;
        }
       }
       return nums;
    }
}
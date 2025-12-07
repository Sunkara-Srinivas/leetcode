class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j,n;
        boolean res=false;
        HashMap<Integer ,Integer>resu=new HashMap<>();
        for(int m=0;m<nums.length;m++)
        {
            int val=nums[m];
            
            if(resu.containsKey(val))
            {
                int prev=resu.get(val);
                System.out.println(prev);
                System.out.println(m);
                if(Math.abs(prev-m)<=k)
                {
                    return true;
                }
            }
            resu.put(val,m);
        }
        return res;
    }
}
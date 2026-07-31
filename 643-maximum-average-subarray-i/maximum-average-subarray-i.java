class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        for(int i=0;i<k;i++)
        {
            max+=nums[i];
        }
        int val=max;
        for(int i=k;i<nums.length;i++)
        {
            val+=nums[i]-nums[i-k];
            max=Math.max(max,val);

        }
        return max/(double)k;
    }
}
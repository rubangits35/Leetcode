class Solution {
    public int maximumDifference(int[] nums) {
        int minval=nums[0];
        int maxDiff=Integer.MIN_VALUE;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]>minval)
            {
                maxDiff=Math.max(maxDiff,nums[j]-minval);
            }
            minval=Math.min(minval,nums[j]);
        }
        return maxDiff==Integer.MIN_VALUE? -1:maxDiff;
    }
}
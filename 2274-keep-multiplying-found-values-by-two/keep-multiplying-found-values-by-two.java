class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int curr:nums)
        {
            if(curr==original)
            {
                original=original*2;
            }
        }
        return original;
    }
}
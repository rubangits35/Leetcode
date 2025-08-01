class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        long sum = 0;

        // First window of size k
        for (int i = 0; i < k; ++i) {
            int val = nums[i];
            countMap.put(val, countMap.getOrDefault(val, 0) + 1);
            sum += val;
        }

        long maxSum = (countMap.size() == k) ? sum : 0;

        // Slide the window
        for (int i = k; i < n; ++i) 
        {
            // Add the new element
            int addVal = nums[i];
            countMap.put(addVal, countMap.getOrDefault(addVal, 0) + 1);
            sum += addVal;

            // Remove the element that's now out of the window
            int removeVal = nums[i - k];
            int count = countMap.get(removeVal) - 1;
            if (count == 0) 
            {
                countMap.remove(removeVal);
            } else 
            {
                countMap.put(removeVal, count);
            }
            sum -= removeVal;
            // Check uniqueness
            if (countMap.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}

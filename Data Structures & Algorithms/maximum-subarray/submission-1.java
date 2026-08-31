class Solution {
    public int maxSubArray(int[] nums) {
         int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int x : nums) {
            currentSum = Math.max(x, currentSum + x);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        
    }
}

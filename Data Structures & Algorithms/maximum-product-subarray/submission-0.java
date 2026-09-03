class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            int temp = currentMax;

            currentMax = Math.max(x, Math.max(currentMax * x, currentMin * x));

            currentMin = Math.min(x, Math.min(temp * x, currentMin * x));

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}
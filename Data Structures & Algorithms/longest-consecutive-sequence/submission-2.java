class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxl = 0;

        // Check every number
        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            // Start only if previous number doesn't exist
            if (!set.contains(current - 1)) {

                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxl = Math.max(maxl, count);
            }
        }

        return maxl;
    }
}
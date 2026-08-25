class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }
}
// xor
// 3^2^3 xor same same=0
//2
//
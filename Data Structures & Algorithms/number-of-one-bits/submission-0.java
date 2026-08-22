class Solution {
    public int hammingWeight(int n) {

        String binary = Integer.toBinaryString(n);

        char[] array = binary.toCharArray();

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == '1') {
                count++;
            }
        }

        return count;
    }
}
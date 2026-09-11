class Solution {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int i = 0; i < 128; i++) {

            if (freq[i] % 2 == 0) {
                length += freq[i];
            } 
            else {
                length += freq[i] - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length++;
        }

        return length;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] c = s.toCharArray();

        int max = 0;

        for (int i = 0; i < c.length; i++) {

            int[] freq = new int[256];

            for (int j = i; j < c.length; j++) {

                freq[c[j]]++;

                if (freq[c[j]] > 1) {
                    break;
                }

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] c = s.toCharArray();

        int max = 0;

        for (int i = 0; i < c.length; i++) {

            for (int j = i; j < c.length; j++) {

                boolean duplicate = false;

                for (int k = i; k < j; k++) {

                    if (c[k] == c[j]) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) {
                    break;
                }

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}
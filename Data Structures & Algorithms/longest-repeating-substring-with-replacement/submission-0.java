class Solution {
    public int characterReplacement(String s, int k) {
         int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            freq[s.charAt(right) - 'A']++;

            // Find highest frequency
            maxFreq = Math.max(maxFreq,
                    freq[s.charAt(right) - 'A']);

            // Shrink if replacements are more than k
            for (; right - left + 1 - maxFreq > k; left++) {

                freq[s.charAt(left) - 'A']--;
            }

            // Find maximum valid length
            maxLength = Math.max(maxLength,
                    right - left + 1);
        }
        return maxLength;
        
    }
}

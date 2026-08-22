class Solution {
    public String longestPalindrome(String s) {
        
        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                boolean palindrome = true;

                int left = i;
                int right = j;

                while (left < right) {

                    if (s.charAt(left) != s.charAt(right)) {
                        palindrome = false;
                        break;
                    }

                    left++;
                    right--;
                }

                if (palindrome && j - i + 1 > longest.length()) {
                    longest = s.substring(i, j + 1);
                }
            }
        }

        return longest;
    }
}
class Solution {
    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char ch = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            // Store character
            chars[index] = ch;
            index++;

            // Store count only if greater than 1
            if (count > 1) {

                String s = String.valueOf(count);

                for (int j = 0; j < s.length(); j++) {
                    chars[index] = s.charAt(j);
                    index++;
                }
            }
        }

        return index;
    }
}
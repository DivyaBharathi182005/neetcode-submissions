class Solution {
    public boolean isAnagram(String s, String t) {
        String str1=s.replaceAll("/s","").toLowerCase();
        String str2=t.replaceAll("/s","").toLowerCase();

        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        return true;
        else
        return false;

    }
}

class Solution {
    public int firstUniqChar(String s)
     {
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++)
        {
            
                char c=s.charAt(i);
                freq[c]++;
                
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(freq[c]==1)
           return i;
        }
       return -1;
        
    }
}
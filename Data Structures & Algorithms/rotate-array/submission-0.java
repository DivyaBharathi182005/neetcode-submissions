class Solution {
    public void rotate(int[] nums, int k) {
    k=k%nums.length;
    for(int r=0;r<k;r++)
    {
        int last=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--)
        {
            nums[i]=nums[i-1];
        }
        nums[0]=last;
        
    }
    
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}

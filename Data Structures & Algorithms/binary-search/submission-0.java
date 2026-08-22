class Solution {
    public int search(int[] nums, int target) 
    {
        int low=0,high=nums.length-1,index=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                 return mid;
            }
            else if(target>nums[mid])
            {
                 low=mid+1;
               
            }
             else if(target<nums[mid])
            {
                 high=mid-1;
                 
            }
            else
            {
                System.out.println("-1");
            }
        }
        return -1;
    }
}


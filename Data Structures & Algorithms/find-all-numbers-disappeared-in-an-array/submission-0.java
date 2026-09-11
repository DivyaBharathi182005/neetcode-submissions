class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       ArrayList<Integer>res=new ArrayList<>();
       for(int x:nums)
       {
        set.add(x);
       }
       for(int i=1;i<nums.length+1;i++)
       {
        if(!set.contains(i))
        {
            res.add(i);
        }
       }

     return res;   
    }
}
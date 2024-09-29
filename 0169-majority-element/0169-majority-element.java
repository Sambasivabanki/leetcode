class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        int ans=-1;
        int n=nums.length/2;
        for(int key:h1.keySet())
        {
            int val=h1.get(key);
            if(val>n)
            {
                ans=key;
                break;
            }
        }
        return ans;
        
    }
}
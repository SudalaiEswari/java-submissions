class Solution {
    public int maxAscendingSum(int[] nums) {
       
        int current = nums[0];
        int max = nums[0];

        for(int i =1;i<nums.length;i++)
        {
           
               if(nums[i]>nums[i-1])
               {
                 current = current+nums[i];
               }
               else
               {
                current = nums[i];
               }
               max = Math.max(max,current);
            
        }
      
        return max;
    }
}
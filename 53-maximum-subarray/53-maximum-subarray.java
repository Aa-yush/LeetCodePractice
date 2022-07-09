class Solution {
    public int maxSubArray(int[] nums) {
        int largest_sum = Integer.MIN_VALUE;
          int sum = 0;
        for(int i = 0; i < nums.length; i++ )
        {
                sum = sum + nums[i];
                if(largest_sum < sum)
                largest_sum = sum;
                if(sum < 0)
                    sum = 0;
                     
           
        }
        return largest_sum;
    }
}
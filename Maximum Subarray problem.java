// Maximum Subarray problem

/* Steps to solve the problem: (Not a brute force solution)
1. Created an array res which store the max value
2. Max value is found by comparing the original value at certain point compared with the sum of that value with previous sum

3. At last returned the updated max value.

*/

class Solution {
    public int maxSubArray(int[] nums) {
        int res[] = new int[nums.length];
        int max=nums[0];
        
        res[0]=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            res[i]=Math.max(nums[i],nums[i]+res[i-1]);
            max= Math.max(max,res[i]);
        }
        return max;
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
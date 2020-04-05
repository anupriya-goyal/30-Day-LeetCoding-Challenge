/* Problem Statement: Given an array nums, 
write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

*/
//Using extra memory
/*class Solution {
    public void moveZeroes(int[] nums) {
        int[] res= new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                res[j]=nums[i];
             //   System.out.println(res[i]);
                j++;
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=res[i];
         //   System.out.println(res[i]+" "+nums[i]);
        } 
    }
}*/

/* TC : O(n)
SC: O(n)
*/

// Without using extra memory
class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0,j=0;
        
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
            
           
        }
        
        for(i=j;i<nums.length;i++)
        {
            nums[i]=0;
        }
            
        
    }
}

/* TC: O(n)
SC: O(1)
*/
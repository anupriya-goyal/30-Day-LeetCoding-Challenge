//counting Elements

/*Given an integer array arr, count element x such that x + 1 is also in arr.

If there're duplicates in arr, count them seperately.

Example 1:

Input: arr = [1,2,3]
Output: 2

*/

class Solution {
    public int countElements(int[] arr) {
        
        Set<Integer> s= new HashSet<>();
        
        for(int i:arr)
        {
            s.add(i);
        }
        
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(s.contains(arr[i]+1))
            {
                count++;
            }
        }
        return count;
    }
}
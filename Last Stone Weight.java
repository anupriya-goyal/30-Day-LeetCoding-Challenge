//  Last Stone Weight
/*
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

 

Example 1:

Input: [2,7,4,1,8,1]
Output: 1
*/


class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>();
        
        for(int stone:stones)
        {
            maxHeap.add(-stone);
        }
        
        while(maxHeap.size()>1)
        {
            int stoneOne = -maxHeap.remove();
            int stoneTwo= -maxHeap.remove();
            
            if(stoneOne-stoneTwo!=0)
            {
                maxHeap.add(-(stoneOne-stoneTwo));
            }
        }
        
        return maxHeap.isEmpty()?0:-maxHeap.remove();
    }
}

/*
TC : O(nlogn)
SC : O(n)
*/
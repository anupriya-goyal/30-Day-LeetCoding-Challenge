//Middle of Linkedlist

/*Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node. 

Example: Input: [1,2,3,4,5]
Output: [3,4,5]

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
     
        ListNode a_pointer=head;
        ListNode b_pointer= head;
        
        while(b_pointer!=null && b_pointer.next!=null)
        {
            a_pointer=a_pointer.next;
            b_pointer=b_pointer.next.next;
        }
        return a_pointer;
    }
}

//2nd Solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 1;
        
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
            length++;
        }
        
        int middle = length / 2;
        
        current = head;
        int i = 0;
        while(i < middle) {
            current = current.next;
            i++;
        }
        
        return current;
    }
}/*
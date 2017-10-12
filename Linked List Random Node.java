/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode a;
    Random b=new Random();
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        a=head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode h=a;
        ListNode m=a;
        int x=1;
        while(m.next!=null){
            x++;
            m=m.next;
        }
        for(int i=x;i>0;i--){
            if(b.nextInt(i)==0)
                return h.val;
            h=h.next;
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
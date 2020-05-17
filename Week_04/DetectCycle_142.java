/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class DetectCycle_142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> list = new HashSet<ListNode>();
        ListNode cur = head;
        while ( cur != null ){
            if ( list.contains(cur) ){
                return cur;
            }
            list.add(cur);
            cur = cur.next; 
        }
        return null;
    }
}
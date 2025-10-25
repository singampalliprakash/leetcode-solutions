/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.val==curr.next.val)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        return head;
        // HashSet<Integer> set=new HashSet<>();
        // ListNode temp=head;
        // while(temp!=null)
        // {
        //     set.add(temp.val);
        //     temp=temp.next;
        // }
        // ListNode dup=new ListNode(-1);
        // ListNode curr=dup;
        // for(int valu:set)
        // {
        //     curr.next=new ListNode(valu);
        //     curr=curr.next;
        // }
        // return dup.next;

        
    }
}
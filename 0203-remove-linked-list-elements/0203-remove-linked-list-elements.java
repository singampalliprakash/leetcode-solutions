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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return null;
        }
         head.next=removeElements(head.next,val);
        if(head.val==val)
        {
            return head.next;  //removes the current element
        }
        else
        {
           
            return head;
        }

        //without Using the recursion concept.
        // ArrayList<Integer> li=new ArrayList<>();

        // while(head!=null)
        // {
        //     if(head.val!=val)
        //     {
        //         li.add(head.val);
        //         head=head.next;
        //     }
        // }

        // ListNode dummy=new ListNode(-1);
        // ListNode curr=dummy;
        // for(int i=0;i<li.size();i++)
        // {
        //     curr.next=new ListNode(li.get(i));
        //     curr=curr.next;
        // }
        // return dummy.next;
        
    }
}
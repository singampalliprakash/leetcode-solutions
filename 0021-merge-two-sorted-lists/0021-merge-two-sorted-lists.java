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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ArrayList<Integer> arr=new ArrayList<>();
        // while(list1!=null)
        // {
        //     arr.add(list1.val);
        //     list1=list1.next;
        // }
        // while(list2!=null)
        // {
        //     arr.add(list2.val);
        //     list2=list2.next;
        // }
        // Collections.sort(arr);
        // ListNode dummy=new ListNode(-1);
        // ListNode curr=dummy;
        // for(int i=0;i<arr.size();i++)
        // {
        //     curr.next=new ListNode(arr.get(i));
        //     curr=curr.next;
        // }
        // return dummy.next;

        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(list1!=null&&list2!=null)
        {
            if(list1.val>list2.val)
            {
                curr.next=list2;
                list2=list2.next;
            }
            else
            {
                curr.next=list1;
                list1=list1.next;
            }
            curr=curr.next;
        }

        curr.next=(list1!=null)?list1:list2;


        return dummy.next;
    }
}
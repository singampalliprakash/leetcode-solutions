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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        ListNode curr=head;
        while(curr!=null)
        {
            res.add(curr.val);
            curr=curr.next;
        }

        int left=0; 
        int right=res.size()-1;
        while(left<right)
        {
            if(!res.get(left).equals(res.get(right)))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
        // int i=0;
        // if(res.size()>0)
        // {
        //     stack.push(res.get(i));
        //     i++;
        // }
        //  ArrayList<Integer> li=new ArrayList<>();
        //  while(!stack.isEmpty())
        //  {
        //     li.add(stack.pop());
        //  }
         

        

        
    }
}
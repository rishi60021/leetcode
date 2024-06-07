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
    public ListNode oddEvenList(ListNode head) {
        
        ArrayList <Integer> ans=new ArrayList<>();
        ListNode temp=head;
          if (head == null){
return null;
          } 
        while(temp!=null && temp.next!=null){
            ans.add(temp.val);
            temp=temp.next.next;

        }
        if(temp!=null){
            ans.add(temp.val);
        }
        temp=head.next;
        while(temp!=null && temp.next!=null){
            ans.add(temp.val);
            temp=temp.next.next;
        }
         if(temp!=null){
            ans.add(temp.val);
        }
        temp=head;
        int i=0;
        while(i<ans.size()&&temp!=null){
            temp.val=ans.get(i);
            temp=temp.next;
            i++;
        }
        return head;
    }
}
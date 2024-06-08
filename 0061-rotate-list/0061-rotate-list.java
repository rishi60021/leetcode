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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0) {
            return head;
        }
        int length=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        tail.next=head;
        if(k%length==0){
            tail.next=null;
            return head;
        }
        int d=k%length;
        int count=1;
        ListNode temp=head;
        while(count!=(length-d)){
            temp=temp.next;
            count++;
        }
        head=temp.next;
        temp.next=null;

        return head;
    }
}
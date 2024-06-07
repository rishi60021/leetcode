/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static ListNode colissionpoint(ListNode headA,ListNode headB,int n){
        while(n>0){
            n--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int size1=0;
        int size2=0;
        while(temp1!=null){
            temp1=temp1.next;
            size1++;
        }
         while(temp2!=null){
            temp2=temp2.next;
            size2++;
        }
        if(size1<size2){
            return colissionpoint(headA,headB,size2-size1);
        }
        else{
            return colissionpoint(headB,headA,size1-size2);
        }

        
    }
}
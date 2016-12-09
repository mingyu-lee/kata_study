package leetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Created by 이민규 on 2016-12-09.
 */
public class addTwoNumbers {
    public ListNode addTwoNumbersMethod(ListNode l1, ListNode l2) {
        ListNode tmpHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = tmpHead;
        int carry = 0;

        while (p != null | q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q= q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return tmpHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
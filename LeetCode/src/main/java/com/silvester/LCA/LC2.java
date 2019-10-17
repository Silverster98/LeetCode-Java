package com.silvester.LCA;

/**
 * LC2
 * O(n)
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode first = new ListNode(-1);
        ListNode next = first;
        while(true) {
            if (l1 == null && l2 == null) break;
            
            int a, b;
            if (l1 == null) a = 0;
            else a = l1.val;
            if (l2 == null) b = 0;
            else b = l2.val;

            c = a + b + c;
            
            ListNode temp;
            if (c >= 10) {
                temp = new ListNode(c % 10);
                c = 1;
            }
            else {
                temp = new ListNode(c);
                c = 0;
            }

            next.next = temp;
            next = temp;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (c != 0) next.next = new ListNode(c);
        return first.next;
    }

    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        // l1.next.next = new ListNode();

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode ans = addTwoNumbers(l1, l2);
        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
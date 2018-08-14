package offer;

import LinkedList.ListNode;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class P14 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)return head;
        ListNode p = head, second = p.next, temp;
        while (second != null) {
            temp = second.next;
            second.next = p;
            if (p.next == second)p .next = null;
            p = second;
            second = temp;
        }
        return p;
    }

    public static void main(String[] argv) {
        P14 temp =new P14();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        temp.ReverseList(head);
    }
}

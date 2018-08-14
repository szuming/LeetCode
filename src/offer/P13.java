package offer;

import LinkedList.ListNode;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class P13 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k == 0)return null;
        ListNode first = head, second = head;
        int count = 1;
        while (second != null) {
            while (count <= k) {
                if (second == null) {
                    return null;
                }
                count++;
                second = second.next;
            }
            if (second == null)break;;
            second = second.next;
            first = first.next;
        }
        return first;
    }

    public static void main(String[] argv) {
        P13 temp =new P13();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        temp.FindKthToTail(head,3);
    }
}

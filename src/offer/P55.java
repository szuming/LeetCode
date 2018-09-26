package offer;

import LinkedList.ListNode;

/**
 * 删除链表中的循环节点
 */
public class P55 {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null)return null;
        ListNode head = new ListNode(0),p;
        head.next = pHead;
        p = head;
        while (p!=null) {
            ListNode temp = p.next;
            ListNode mark = p.next;
            while (temp!=null && temp.next!=null&&temp.val == temp.next.val) {
                temp= temp.next;
            }
            if (mark == temp){
                p=p.next;
            }else {
                p.next = temp.next;
            }
        }
        return head.next;
    }

    public static void main (String[] args){
        P55 temp = new P55();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);
        temp.deleteDuplication(head);
    }
}

package offer;

import LinkedList.ListNode;

/**
 * 两个链表的第一个公共节点
 */
public class P35 {
    public ListNode FindFirstCommonNode (ListNode pHead1,ListNode pHead2){
        ListNode p1 = pHead1, p2 = pHead2;
        int len1 = 0, len2 = 0;
        while (p1 != null) {
            len1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            len2++;
            p2 = p2.next;
        }
        int ahead, i;
        p1 = pHead1;
        p2 = pHead2;
        if (len1 > len2) {
            ahead = len1 - len2;
            for (i = 0;i < ahead;i++) p1 = p1.next;
            while (p1 != null) {
                if (p1 == p2) {
                    return p1;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
        }else {
            ahead = len2 - len1;
            for (i = 0;i < ahead;i++) p2 = p2.next;
            while (p1 != null) {
                if (p1 == p2) {
                    return p1;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return null;
    }
}

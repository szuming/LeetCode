package offer;

import LinkedList.ListNode;

/**
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class P15 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode head = result;
        if (list1 == null)return list2;
        if (list2 == null)return list1;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        while (list1 != null){
            result.next = list1;
            list1 = list1.next;
            result = result.next;
        }
        while (list2 != null) {
            result.next = list2;
            list2 = list2 .next;
            result = result.next;
        }
        return head.next;
    }
}

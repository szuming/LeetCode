package offer;

import LinkedList.ListNode;

import java.util.ArrayList;


/**
 * 题目描述
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class P5 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        return add(listNode,result);
    }

    private ArrayList<Integer> add(ListNode listNode, ArrayList<Integer> result) {
        if (listNode != null) {
            add(listNode.next, result);
            result.add(listNode.val);
        }
        return result;
    }
}

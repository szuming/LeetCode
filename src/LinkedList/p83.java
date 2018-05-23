package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

 示例 1:

 输入: 1->1->2
 输出: 1->2

 示例 2:

 输入: 1->1->2->3->3
 输出: 1->2->3


 */
public class p83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        Set<Integer> set=new HashSet<>();
        ListNode node=head,temp=head.next;
        set.add(node.val);
        while (temp!=null){
            if(!set.contains(temp.val)){
                set.add(temp.val);
                node=node.next;
            }else{
                node.next=temp.next;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] argv){
        p83 temp=new p83();
        ListNode head=new ListNode(-1);
        head.next=new ListNode(0);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(3);
        temp.deleteDuplicates(head);
    }
}

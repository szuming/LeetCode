package LinkedList;

/**
 * 24. 两两交换链表中的节点
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * 说明:
 *
 *     你的算法只能使用常数的额外空间。
 *     你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class p24{
    public ListNode swapPairs(ListNode head) {
        if(head!=null&&head.next!=null){
            ListNode temp=head.next;
            head.next=temp.next;
            temp.next=head;
            head=temp;
        }else{
            return head;
        }
        ListNode index=head.next,nextNode=index.next;
        while(nextNode!=null&&nextNode.next!=null){
            index.next=nextNode.next;
            nextNode.next=index.next.next;
            index.next.next=nextNode;
            index=index.next.next;
            nextNode=nextNode.next;
        }
        return head;
    }

    public static void main(String[] argv){
        p24 temp=new p24();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        temp.swapPairs(head);
    }
}

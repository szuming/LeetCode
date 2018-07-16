package LinkedList;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 */
public class p19{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode index=head,temp=head;
        int count=0;
        while(index!=null&&count<=n){
            index=index.next;
            count++;
        }
        if(count==n){
            head=head.next;
            return head;
        }
        while(index!=null){
            index=index.next;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

    public static void main(String[] argv){
        p19 temp=new p19();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        //head.next.next=new ListNode(3);
        temp.removeNthFromEnd(head,2);
    }
}

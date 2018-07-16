package LinkedList;

/**
 * 21. 合并两个有序链表
 * 题目描述提示帮助提交记录社区讨论阅读解答
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class p21{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result,index=new ListNode(0);
        result=index;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                index.next=new ListNode(l2.val);
                l2=l2.next;
                index=index.next;
            }else {
                index.next=new ListNode(l1.val);
                l1=l1.next;
                index=index.next;
            }
        }
        if(l1!=null){
            index.next=l1;
        }
        if(l2!=null){
            index.next=l2;
        }
        result=result.next;
        return result;
    }

    public static void main(String[] argv){
        p21 temp=new p21();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(3);
        l1.next.next=new ListNode(5);
        ListNode l2=new ListNode(2);
        l2.next=new ListNode(4);
        l2.next.next=new ListNode(6);
        temp.mergeTwoLists(l1,l2);
    }
}

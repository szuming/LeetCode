package LinkedList;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

 你可以假设除了数字 0 之外，这两个数字都不会以零开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807


 */
public class p2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultRoot=new ListNode(0),father=resultRoot,temp;
        while(l1!=null&&l2!=null){                                      //先找到最先结束的链表
            temp=new ListNode(l1.val+l2.val);
            father.next=temp;                   //连接下一节点
            father=father.next;
            l1=l1.next;                         //l1,l2往后移
            l2=l2.next;
        }
        while(l1!=null) {                                               //将剩余的位加到结果链表中
            father.next=l1;
            father=father.next;
            l1=l1.next;
        }
        while(l2!=null) {                                               //将剩余的位加到结果链表中
            father.next=l2;
            father=father.next;
            l2=l2.next;
        }
        father=resultRoot.next;                                         //重新遍历一次链表，将进位加到下一位
        while(father!=null) {
            if(father.next==null){                                      //如果下一点为空，判断是否有进位，然后返回
                if(father.val>=10){
                    father.next=new ListNode(father.val/10);
                    father.val=father.val%10;
                }
                break;
            }
            father.next.val+=father.val/10;
            father.val=father.val%10;
            father=father.next;
        }
        return resultRoot.next;
    }

    public static void main(String[] argv){
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        p2 temp=new p2();
        temp.addTwoNumbers(l1,l2);
    }
}

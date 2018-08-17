package offer;
//
///**
// * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
// * 另一个特殊指针指向任意一个节点），
// * 返回结果为复制后复杂链表的head。（
// * 注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
// */
//public class P24 {
//    public RandomListNode Clone(RandomListNode pHead){
//        if (pHead == null)return null;
//        RandomListNode index = pHead;
//        // 先复制并放到父节点后面
//        while (index != null) {
//            RandomListNode copyNode = new RandomListNode(index.label);
//            copyNode.next = index.next;
//            index.next = copyNode;
//            index = index.next.next;
//        }
//        // 设置随机指针
//        index = pHead;
//        while (index != null) {
//            if (index.random != null){
//                index.next.random = index.random.next;
//            }
//            index = index.next.next;
//        }
//        // 取出复制的链表
//        index = pHead.next;
//        RandomListNode result = pHead.next;
//        RandomListNode head = pHead;
//        while (index.next != null) {
//            index.next = index.next.next;
//            if (head.next != null) {
//                head.next = head.next.next;
//            }
//            head = head.next;
//            index = index.next;
//        }
//        return result;
//    }
//
//    public static void main(String[] argv) {
//        P24 temp = new P24();
//        RandomListNode pHead = new RandomListNode(1);
//        pHead.next = new RandomListNode(2);
//        pHead.next.next = new RandomListNode(3);
//        pHead.next.next.next = new RandomListNode(4);
//        pHead.next.next.next.next = new RandomListNode(5);
//        temp.Clone(pHead);
//    }
//}
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/


import offer.RandomListNode;

public class P24 {
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null)
            return null;
        RandomListNode pCur = pHead;
        //复制next 如原来是A->B->C 变成A->A'->B->B'->C->C'
        while(pCur!=null){
            RandomListNode node = new RandomListNode(pCur.label);
            node.next = pCur.next;
            pCur.next = node;
            pCur = node.next;
        }
        pCur = pHead;
        //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
        while(pCur!=null){
            if(pCur.random!=null)
                pCur.next.random = pCur.random.next;
            pCur = pCur.next.next;
        }
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        pCur = pHead;
        //拆分链表
        while(pCur!=null){
            pCur.next = pCur.next.next;
            if(cur.next!=null)
                cur.next = cur.next.next;
            cur = cur.next;
            pCur = pCur.next;
        }
        return head;
    }
}
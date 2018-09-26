package offer;

import LinkedList.ListNode;

/**
 * 链表中环的入口节点
 */
public class P54 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null)return null;
        ListNode pFast = pHead.next,pSlow = pHead;
        int count = 0;
        while (pFast!=pSlow&pFast!=null) {
            if (pFast.next!=null)pFast = pFast.next.next;
            else pFast=null;
            pSlow = pSlow.next;
            count++;
        }
        if(pFast==null)return null;
        pFast = pHead;
        pSlow = pHead;
        for (int i = 0;i <= count;i++) {
            pFast = pFast.next;
        }
        while (pFast!=pSlow) {
            pFast = pFast.next;
            pSlow = pSlow.next;
        }
        return pFast;
    }
}

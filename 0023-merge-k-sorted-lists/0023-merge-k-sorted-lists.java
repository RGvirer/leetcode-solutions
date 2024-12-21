/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode lst= new ListNode(0);
        ListNode current=lst;
        while(true){
            ListNode minNode=null;
            int minIndex=-1;

            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null){
                    if(minNode==null||lists[i].val<minNode.val){
                        minNode=lists[i];
                        minIndex=i;
                    }
                }
            }
            if (minNode == null) {
                break;
            }
            current.next=minNode;
            current=current.next;
            lists[minIndex]=lists[minIndex].next;
        }
        return lst.next;
    }
}
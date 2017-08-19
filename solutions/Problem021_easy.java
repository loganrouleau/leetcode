// 21. Merge Two Sorted Lists

public class Problem021_easy {

    // Definition for singly-linked list.

    public class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val = x;
        }
    }

    private void addLast(ListNode l, int d){
        ListNode last = new ListNode(d);
        ListNode node = l;
        if(l == null){
            l = last;
        } else{
            while(node.next != null){
                node = node.next;
            }
            node.next = last;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode result = new ListNode(0);

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                addLast(result, l1.val);
                l1 = l1.next;
            } else{
                addLast(result, l2.val);
                l2 = l2.next;
            }
        }

        if(l1 == null){
            while(l2 != null){
                addLast(result, l2.val);
                l2 = l2.next;
            }
        } else{
            while(l1 != null){
                addLast(result, l1.val);
                l1 = l1.next;
            }
        }
        return result.next;
    }
}
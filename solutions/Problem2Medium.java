public class Problem2Medium {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addToEnd(ListNode head, int value) {
        ListNode ret = head;
        if (head == null) {
            return new ListNode(value);
        }
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(value);
        return ret;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int remainder = 0;
        while (l1 != null || l2 != null) {
            int currSum = 0;
            currSum += remainder;
            remainder = 0;
            currSum += (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

            if (currSum > 9) {
                currSum -= 10;
                remainder++;
            }

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
            result = addToEnd(result, currSum);
        }
        if (remainder > 0) {
            result = addToEnd(result, remainder);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(5);
        //test1.next = new ListNode(4);
        //test1.next.next = new ListNode(6);
        //test1.next.next.next = new ListNode(8);

        ListNode test2 = new ListNode(5);
        //test2.next = new ListNode(6);
        //test2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(test1, test2);
    }
}

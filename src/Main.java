public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(0);
        int res = 0;

        while (head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }

        System.out.println("The answer is " + res);
    }
}

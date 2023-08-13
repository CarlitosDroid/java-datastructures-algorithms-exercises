public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(new ListNode(5));
        ll.insertAtEnd(new ListNode(10));
        ll.insertAtEnd(new ListNode(2));

        ll.printList();
        ll.deleteNodeByData(10);
        ll.printList();
    }
}

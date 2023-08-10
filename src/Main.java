public class Main {

    public static void main(String[] args) {

        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        // Node head1 = new Node(5);
        ll1.addToTheLast(new Node(5));
        ll1.addToTheLast(new Node(10));
        ll1.addToTheLast(new Node(15));

        // Node head2 = new Node(2);
        ll2.addToTheLast(new Node(2));
        ll2.addToTheLast(new Node(3));
        ll2.addToTheLast(new Node(20));
        ll2.printList();

        ll1.head = new Gfg().sortedMerge(ll1.head, ll2.head);
        ll1.printList();
    }
}

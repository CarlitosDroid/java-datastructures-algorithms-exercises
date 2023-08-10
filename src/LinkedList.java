public class LinkedList {
    Node head;

    public void addToTheLast(Node node)
    {
        if (head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Method to print linked list */
    void printList()
    {
        System.out.println("Merged Linked List is:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

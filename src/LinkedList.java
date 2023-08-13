
public class LinkedList {

    ListNode head;

    public void insetAtBeginning(int data) {
        ListNode newNode = new ListNode(data);

        newNode.next = head;

        head = newNode;
    }

    public void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public boolean searchNode(ListNode head, int data) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteNodeByPosition(int position) { // position
        if (head == null)
            return;

        ListNode temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If the key is not present
        if (temp == null || temp.next == null)
            return;

        // Remove the node
        ListNode next = temp.next.next;

        temp.next = next;
    }

    public void deleteNodeByData(int data) {
        ListNode temp = head;
        ListNode prev = null;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    public int deleteNodeWithRecursion(ListNode head, int data) { // Recursion but it doesn't delete the last element

        if (head == null) {
            return -1;
        }

        if (head.data == data) {
            if (head.next != null) {
                head.data = head.next.data;
                head.next = head.next.next;
                return 1;
            } else {
                return 0;
            }
        }

        if (deleteNodeWithRecursion(head.next, data) == 0) {
            head.next = null;
            return 1;
        }
        return -1;
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
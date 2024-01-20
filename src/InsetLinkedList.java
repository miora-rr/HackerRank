public class InsetLinkedList {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode fistElement = llist;
        SinglyLinkedListNode current = llist;

        for (int i=0; i<position-1;i++){
            current = current.next;
        }

        SinglyLinkedListNode temp = current.next;
        current.next = new SinglyLinkedListNode(data);
        current.next.next = temp;

        return fistElement;
    }
}

public class ReverseDoublyLinkedList {
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode currentNode = llist;
        DoublyLinkedListNode prev = null;

        while (currentNode != null){
            DoublyLinkedListNode next = currentNode.next;

            currentNode.next = prev;
            currentNode.prev = next;
            prev = currentNode;
            currentNode = next;
        }

        llist = prev;

        return llist;
    }
}

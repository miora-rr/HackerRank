public class MergeTwoSortedLinkedList {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data){
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            System.out.println(current.next.data);
            current = current.next;
        }

        // If one of the linkedList is longer than another
        if (head1 != null) current.next = head1;
        if (head2 != null) current.next = head2;

        return dummy.next;
    }
}

package org.example.linkedList;

public class DeleteDuplicates {
    public Node deleteDuplicates(Node head) {
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}

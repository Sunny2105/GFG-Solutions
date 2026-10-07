/* Definition of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class Solution {
    public Node sortedInsert(Node head, int key) {
        Node n1 = new Node(key);
        if (head == null || key <= head.data) {
            n1.next = head;
            return n1;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data < key) {
            temp = temp.next;
        }

        n1.next = temp.next;
        temp.next = n1;

        return head;
    }
}
/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        Node n1 = new Node(val);
        if (pos == 1) {
            n1.next = head;
            return n1;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        n1.next = temp.next;
        temp.next = n1;
        return head;
    }
}
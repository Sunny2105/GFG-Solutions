/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;

        temp = head;

        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
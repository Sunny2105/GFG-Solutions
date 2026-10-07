/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node n1 = new Node(x);

        if (head == null) {
            return n1;
        }

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = (count + 1) / 2;

        temp = head;

        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

        n1.next = temp.next;
        temp.next = n1;

        return head;
    }
}
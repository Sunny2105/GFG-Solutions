/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        Node temp = head;
        ArrayList<Integer> lst=new ArrayList<>();
        while (temp != null) {
            lst.add(temp.data);
            temp = temp.next;
        }
        return lst;
    }
}
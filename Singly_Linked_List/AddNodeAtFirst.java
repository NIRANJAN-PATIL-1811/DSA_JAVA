package DSA_JAVA.Singly_Linked_List;

public class AddNodeAtFirst {
    public static void main(String args[]){
        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Traverse.printLinkedList(head);
        head = AddNewNodeAtFirst.addNodeAtFirst(11, head);
        Traverse.printLinkedList(head);
    }
}


class AddNewNodeAtFirst {
    public static Node addNodeAtFirst(int val, Node head){
        Node current = head;
        Node new_node = new Node(val);
        new_node.next = current;
        current = new_node;
        return current;
    }
}
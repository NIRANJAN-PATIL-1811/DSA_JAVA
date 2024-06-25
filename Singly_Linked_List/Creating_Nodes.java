package DSA_JAVA.Singly_Linked_List;

public class Creating_Nodes {
    public static void main(String args[]){
        System.out.println("Script Is Running...");
        Node n1 = new Node(9);          // Node first created
        Node n2 = new Node(4);          // Node second created
        Node n3 = new Node(5);          // Node third created
        Node n4 = new Node(2);          // Node fourth created

        Node head = n1;                     // Declared node first as a head node
        n1.next = n2;                       // Node first is connected to node second
        n2.next = n3;                       // Node second is connected to node third
        n3.next = n4;                       // Node third is connected to node fourth

        Traverse.printLinkedList(head);     // Traversed LinkedList here
        System.out.println("\nScript Has Been Stopped!!");
    }
}


class Node {
    protected int data;
    protected Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Traverse {
    public static void printLinkedList(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }
}
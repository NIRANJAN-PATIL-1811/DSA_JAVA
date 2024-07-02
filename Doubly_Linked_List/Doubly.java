package DSA_JAVA.Doubly_Linked_List;

public class Doubly {
    public static void main(String args[]){
        int arr[] = {4,5,8,6,9,7,2};

        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i = 1; i < arr.length; i++){
            Node remaining_nodes = new Node(arr[i]);
            tail.next = remaining_nodes;
            remaining_nodes.previous = tail;
            tail = remaining_nodes;
        }

       head = AddNode.addFirstNode(43, head);
//        AddNode.addLastNode(45, head);
//        head = AddNode.addAtIndex(2,0,head);
//        head = RemoveNode.removeNodeFirst(head);
//        RemoveNode.removeNodeLast(head);
//        head = RemoveNode.removeIndexVal(1, head);
        Traverse.printData(head);
    }
}

class Node {
    protected int data;
    protected Node next;
    protected Node previous;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}


class AddNode{
    public static Node addFirstNode(int data, Node head){
        Node current = head;

        Node latest_node = new Node(data);
        latest_node.next = current;
        head = latest_node;
        return head;
    }

    public static void addLastNode(int data, Node head){
        Node current = head;

        while (current != null){
            if (current.next == null){
                Node latest_node = new Node(data);
                current.next = latest_node;
                current = latest_node;
            }
            current = current.next;
        }
    }

    public static Node addAtIndex(int indexNumber, int value, Node head){
        Node current = head;
        int count = 0;

        if (indexNumber == 1){
            Node latest_node = new Node(value);
            latest_node.next = current;
            head = latest_node;
        }

        while (current != null){
            if (count == indexNumber - 2){
                Node latest_node = new Node(value);
                Node temp = current.next;
                current.next = latest_node;
                latest_node.next = temp;
            }
            current = current.next;
            count++;
        }

        return head;
    }
}

class RemoveNode{
    public static Node removeNodeFirst(Node head){
        Node current = head;
        head = current.next;
        return head;
    }

    public static void removeNodeLast(Node head){
        Node current = head;
        while (current != null){
            if (current.next.next == null){
                current.next = null;
                break;
            }
            current = current.next;
        }
    }

    public static Node removeIndexVal(int indexNumber, Node head){
        Node current = head;

        if (indexNumber == 1){
            current = current.next;
            head = current;
        }
        int count = 0;
        while (current != null){
            if (count == indexNumber - 2){
                Node temp = current.next.next;
                current.next = temp;
                break;
            }
            current = current.next;
            count++;
        }
        return head;
    }
}

class Traverse{
    public static void printData(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "<-->");
            current = current.next;
        }
        System.out.print("null");
    }
}
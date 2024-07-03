package DSA_JAVA.Stack;

public class Stack {
    public static void main(String args[]){
//        int arr[] = {4,5,6,3,5,9,3};
//
//        Node first_node = new Node(arr[0]);
//        Node top = first_node;
//
//        for (int i = 1; i < arr.length; i++){
//            Node latest_node = new Node(arr[i]);
//            latest_node.next = top;
//            top = latest_node;
//        }
//
//        Traverse.printData(top);
    }
}


class Node{
    protected char data;
    protected Node next;

    public Node(char data){
        this.data = data;
        this.next = null;
    }
}

class Traverse{
    public static void printData(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }
}
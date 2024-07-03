package DSA_JAVA.Stack;

public class Reverse_String {
    public static void main(String args[]){
        String name = "FATHER";
        char arr[] = name.toCharArray();

        Node first_node = new Node(arr[0]);
        Node top = first_node;

        for (int i = 1; i < arr.length; i++){
            Node latest_node = new Node(arr[i]);
            latest_node.next = top;
            top = latest_node;
        }
        Traverse.printData(top);
    }
}

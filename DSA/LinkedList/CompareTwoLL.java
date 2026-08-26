// Compare two linked lists Algorithm Implement in a Java

public class CompareTwoLL {

    // Node class for linked list
    public static class Node {

        // Data Members And Public Specifiers
        public int data;
        public Node next;

        // Parameterized Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head = null;

        // Insert Node in Linked List
        public static Node insert(Node head, int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            return head;
        }

        // Compare two linked lists
        public static boolean compareLists(Node head1, Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;

            while(temp1 != null && temp2 != null) {
                if(temp1.data != temp2.data) {
                    return false;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            // If both lists are of same length, both should be null
            return (temp1 == null && temp2 == null);
        }

        // Print the linked list
        public static void printList(Node head) {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        Node list1 = null;
        Node list2 = null;

        // Insert elements in first linked list
        list1 = Node.insert(list1, 1);
        list1 = Node.insert(list1, 2);
        list1 = Node.insert(list1, 3);

        // Insert elements in second linked list
        list2 = Node.insert(list2, 1);
        list2 = Node.insert(list2, 2);
        list2 = Node.insert(list2, 3);

        // Print both linked lists
        System.out.print("First Linked List: ");
        Node.printList(list1);

        System.out.print("Second Linked List: ");
        Node.printList(list2);

        // Compare the two linked lists
        if(Node.compareLists(list1, list2)) {
            System.out.println("The two linked lists are identical.");
        } else {
            System.out.println("The two linked lists are not identical.");
        }
    }
}

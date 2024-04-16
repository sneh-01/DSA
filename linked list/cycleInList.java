public class cycleInList {


        static class Node {
            int data;
            Node next;
    
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        public static boolean detectLoop(Node head) {
            Node tortoise = head;
            Node hare = head;
    
            while (hare != null && hare.next != null) {
                tortoise = tortoise.next;
                hare = hare.next.next;
    
                // If tortoise and hare pointers meet, there is a loop
                if (tortoise == hare) {
                    return true; // Loop detected
                }
            }
    
            return false; // No loop detected
        }
    
        public static void main(String[] args) {
            // Create a linked list with a loop
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = head.next; // Creating a loop
    
            // Check for a loop in the linked list
            if (detectLoop(head)) {
                System.out.println("Loop detected in the linked list.");
            } else {
                System.out.println("No loop detected in the linked list.");
            }
        }
    }
    
//tortauce and hare problem 
// tortauce go one buy one and hare   goes one skip and after or in 2 - 2 interval
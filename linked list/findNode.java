// public class findNode{
//     public static void main(String[] args) {
        


//     }
// }

public class findNode<T> {
    // ... (previous code for Node and LinkedList class)

    public T findKthNodeFromEnd(int k) {
        if (head == null || k <= 0) {
            return null;
        }

        Node<T> p1 = head;
        Node<T> p2 = head;

        // Move the p2 pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (p2 == null) {
                return null; // k is greater than the length of the list
            }
            p2 = p2.next;
        }

        // Move both pointers until p2 reaches the end
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1.data; // p1 is now at the kth node from the end
    }
}

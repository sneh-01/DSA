import java.util.LinkedList;
// import LinkedList.java;


public class classroom {

    public static class  Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
      
        }
        return slow;

    }
    private Node merge(Node head1 , Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;

            }
            while(head2 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;

            }
        }
        return mergeLL.next;

    }

    public Node MergeSort(Node head){
        if(head == null && head.next == null){
            return head;
        }


        // find mid
        Node mid = getMid(head);

        // left and right ms
        Node rightHead  = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        return merge(head , rightHead );
    }

    public void zigzag(Node head){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        
        }
        Node mid = slow;

        
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        // alt merge     zig-zag - merge

        Node left = head;
        Node right = prev;
        Node nextL ;
        Node nextR;
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;


            left = nextL;
            right = nextR;
        }

        
    }


    public static void main(String[] args) {
        // create--objects
        LinkedList<Integer> ll = new LinkedList<>();

        // add 
        
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addLast(5);
        ll.addLast(8);
        ll.addLast(43);
        // ll.head = ll.MergeSort(ll.head);
        // ll.MergeSort(ll.head);
        System.out.println(ll);
        ll.zigZag();


        // remove
        
    }
}

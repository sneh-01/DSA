import org.w3c.dom.Node;

public class reverseLinklist {
     Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    
}


// with previous current and next we can solve this very easily.
// current->next = p
// p=c
// c=next

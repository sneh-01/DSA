public class LinkedList {

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

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;

        }

        tail.next = newNode;
        tail = newNode; 
    }

    public void print(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int index , int data){

        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;


    }

    public int removeFirst(){

        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail  = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail  = null;
            size = 0;
            return val;
        }
        // prev = size-2
        Node prev = head;
        for(int i =0 ; i < size-2; i++){
            prev= prev.next;

        }
        int val = prev.next.data;
        prev.next  = null;
        tail = prev;
        size--;
        return val;
    }

    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index ++;
    }

    public void revers(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = next;
        }
        head = prev;

    }
    public void deletNthfromEnd(int n){
        int sz=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;
            return;

        }

        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;


    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;//slow-fast aproach
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midnode = findMid(head);

        Node  prev = null;
        Node curr = midnode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;    
            
        }
        Node right = prev;
        Node left = head;

        
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;


        }
        return true;

    }

    public boolean isCycle(){   //floyd's algo.
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return; 
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        // remove cycle 
        prev.next = null;
    }


   

    public int recursivesearch(int key){
        return helper(head, key);

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(10);
       
        // ll.add(2,9);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.size);
        // ll.revers();
        //  ll.deletNthfromEnd(3);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        System.out.println(ll.isCycle());
        removeCycle();
        System.out.println(ll.isCycle());

       


        
    }
    
}

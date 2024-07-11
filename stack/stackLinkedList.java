package stack;

import java.util.Stack;

public class stackLinkedList {

    static class Node{
        int data;
        Node head;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;

        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;

        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(18);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        
    }
    
}


// using jcf
// Stack<Integer> s = new Stack<>();

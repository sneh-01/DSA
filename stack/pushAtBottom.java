package stack;
import java.util.*;

public class pushAtBottom {

    public static void pushbottom(Stack<Integer> s ,  int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushbottom(s, data);
        s.push(top);


    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(6    );
        s.push(9);

        pushbottom(s, 7);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        } 
    }
    
}

package stack;
import java.util.*;

public class reverseString {
    public static String ReverseString(String str){
        Stack<Character> s = new Stack();
        int inx= 0;
        while(inx<str.length()){
            s.push(str.charAt(inx));
            inx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return  result.toString();

    }

    public static void main(String[] args) {
        String str = "sneha";
       String result =  ReverseString(str);
       System.out.println(result);
        
    }
    
}

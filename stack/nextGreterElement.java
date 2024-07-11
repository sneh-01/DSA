package stack;
import java.util.*;

public class nextGreterElement {

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<Integer>();
        int nextGreter[] = new int[arr.length];

        for(int i = 0; i <= arr.length-1; i++) {
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                nextGreter[i] = -1;
            }else{
                nextGreter[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i =0 ; i < nextGreter.length; i++) {
            System.out.println(nextGreter[i] + "");

        }
        System.out.println();

    }

    // next greter right 
    // next greter left(loop 0 , arr.length)
    // next smallest element right(arr[s.peek()] >= arr[i])
    // next smallesr lest ( reverse loop and while logis)
    
}
// imp
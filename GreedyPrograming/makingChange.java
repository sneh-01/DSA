package GreedyPrograming;
import java.util.*;

public class makingChange {
    public static void main(String[] args) {

        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins , Comparator.reverseOrder());
        int Count=0;
        int amount = 5900;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i =0 ; i<coins.length ; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    Count ++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }

            }

        }
        System.out.println("coins use is : " + coins);

        for(int i=0; i<ans.size() ; i++){
            System.out.println(ans.get(i) + " ");
        }

        
    }
}

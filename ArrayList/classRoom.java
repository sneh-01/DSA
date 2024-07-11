package ArrayList;
import java.util.ArrayList;

public class classRoom {

    // public static int storewater(ArrayList<Integer> height) {
    //     int maxWater = 0;
    //     for(int i = 0; i < height.size(); i++) {
    //         for(int j = i+1; j < height.size(); j++) {
    //             int width = j - i;
    //             int minHeight = Math.min(height.get(i), height.get(j));
    //             maxWater = Math.max(maxWater, width * minHeight);
    //         }
    //     }
    //     return maxWater;
    // }

    public static int storewater(ArrayList<Integer> height) {
        // o(n)

            
        int maxheight = 0;
        int lp = 0;
        int rp  = height.size()-1;
         while(lp < rp){

            int ht = Math.min(height.get(lp) , height.get(rp));
            int width = rp-lp;
            int currentWater = ht * width;
            maxheight = Math.max(maxheight, currentWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }

         }
         return maxheight;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));
    }
}

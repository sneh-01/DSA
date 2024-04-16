import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        // country(key) , population (value)
        HashMap<String, Integer> map = new HashMap<String, Integer>();


        //Insertion
        map.put("India", 120);
        map.put("us", 100);
        map.put("china", 140);

        System.out.println(map);

        // Deletion
        map.remove("us");
        System.out.println(map);

        // Search  value
        System.out.println(map.get("china"));

        if(map.containsKey("china")){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }

        // iteration in HashMap
        int arr[] = {1,2,3,4,5};
        for(int val : arr){
            // val arr is collection of value now we are perform opration and store in val variable
            System.out.println(val + "");

        
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // here e is a variable like val
        // Map.Entry<String, Integer> type of map
        // map.entrySet(): This is the expression that provides the collection of entries from the map. The entrySet() method returns
        //  a Set containing all the entries in the map.
        // kind of for each loop


        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        

        
    }
    
}

// key value pair
// hashmap is unordered map



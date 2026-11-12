import java.util.HashMap;
import java.util.Set;
public class HashMapDemo {
    public static void main(String args[]){
        HashMap<String,Integer> hmap = new HashMap<>();
        
        // Put function -O(1)

        hmap.put("India",150);
        hmap.put("Indonasia",140);
        hmap.put("Nepal",43);
        hmap.put("India",160);

        // Get Function - O(1)

        System.out.println(hmap.get("India"));

        // containsKey - O(1)

        System.out.println(hmap.containsKey("India"));

        // remove - O(1)

        hmap.remove("Nepal");

        // size 

        System.out.println(hmap.size());

        // isEmpty

        System.out.println(hmap.isEmpty());

        // clear

        // hmap.clear();


        System.out.println(hmap);

        Set<String> keys= hmap.keySet();

        for(String k : keys){
            System.out.println("key="+k+", value="+hmap.get(k));
        }

    }
    
}

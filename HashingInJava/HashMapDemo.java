package HashingInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("chaina",150);
        System.out.println(map);
        //updation
        map.put("chaina",45);
        System.out.println(map);
        //searching keys
        if(map.containsKey("India"))
            System.out.println("present");
        else System.out.println("not present");
        //seraching values
        System.out.println(map.get("chaina"));
        for ( Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}

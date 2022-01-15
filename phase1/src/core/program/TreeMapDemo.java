package core.program;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
    	
        TreeMap<String, Integer> fruits = new TreeMap<String, Integer>();
        fruits.put("apple1", 120);
        fruits.put("banana4", 99);
        fruits.put("kiwi3", 130);
        fruits.put("cherry2", 190);
        fruits.put("watermelon6", 89);
        fruits.put("strawberry5", 142);
        
        for(String key: fruits.keySet()){
			System.out.println(key  +" : "+ fruits.get(key));
        }
}
}

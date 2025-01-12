import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    HashMap<String, List<Integer>> map;
    String input = "newlifestring";

    public MyHashMap() {
        map = new HashMap<>();
    }

    public void storeIndexes(){
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            map.putIfAbsent(String.valueOf(ch), new ArrayList<>());
            map.get(String.valueOf(ch)).add(i);
        }
    }

    public void printMap(){

        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        map.forEach( (key, value) -> {System.out.println("Key: " + key + ", Value: " + value);});
    }
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.storeIndexes();
        map.printMap();
    }
}



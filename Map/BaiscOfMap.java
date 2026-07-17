import java.util.Map;
import java.util.HashMap;

class BaiscOfMap{

    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Atharva");
        map.put(2, "Rahul");
        map.put(3, "Amit");

        System.out.println(map);

        // get()
        System.out.println(map.get(2));

        // containsKey()
        System.out.println(map.containsKey(1));

        // getOrDefault()
        System.out.println(map.getOrDefault(5, "Not Found"));

        // remove()
        map.remove(3);
        System.out.println(map);

        // size()
        System.out.println(map.size());

        // keySet()
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // values()
        for (String value : map.values()) {
            System.out.println(value);
        }

        // entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // clear()
        map.clear();

        // isEmpty()
        System.out.println(map.isEmpty());
    }
}
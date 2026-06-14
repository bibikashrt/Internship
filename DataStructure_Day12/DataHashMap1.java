
import java.util.HashMap;

public class DataHashMap1 {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("Ram", 10);
        people.put("Hari", 20);
        people.put("Sita", 30);
        people.put("Gita", 40);

        System.out.println("Add: " + people);

        System.out.println("Get: " + people.get("Hari"));

        people.remove("Sita");
        System.out.println("Remove: " + people);

        people.replace("Gita", 50);
        System.out.println("Replace: " + people);

        for (String i : people.keySet()) {
            System.out.println(i);
        }
        for (Integer i : people.values()) {
            System.out.println(i);
        }
        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }

    }

}

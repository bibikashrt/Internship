
import java.util.HashMap;

public class DataHashMap {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println("After get:" + capitalCities.get("England"));

        capitalCities.remove("England");
        System.out.println("After removing:" + capitalCities);

        System.out.println("The size is:" + capitalCities.size());

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}

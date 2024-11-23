import java.util.*;

public class itinerary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> Map = new HashMap<>();
        System.out.println("Enter the number of key-value pairs in the HashMap:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the key number-" + i);
            String key = sc.next();
            System.out.println("Enter the value number-" + i);
            String value = sc.next();
            Map.put(key, value);
        }
        iti(Map);
    }

    public static void iti(HashMap<String, String> map) {
         
    }
}

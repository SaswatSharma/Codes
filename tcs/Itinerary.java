import java.util.*;

public class Itinerary {
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
		// String C = "";
		String B = "";
		// System.out.println(map);
		HashSet<String> set1 = new HashSet<>(map.values());
		// System.out.println(map.values());
		// HashSet<String> set2 = new HashSet<>();
		/*
		 * for (Map.Entry<String, String> entry : map.entrySet()) {
		 * set1.add(entry.getKey());
		 * set2.add(entry.getValue());
		 * }
		 */
		if(B.length()==0)
		System.out.println("No starting point,therefore itnerary not possible");
		else{
		for (String ntry : map.keySet()) {
			if (set1.contains(ntry))
				continue;
			else {
				B = ntry;
				break;
			}
		}
		// for (String A : set2) {
		// if (set1.contains(A))
		// continue;
		// else
		// C = A;
		// }
		System.out.println("The itinerary of the given tickets is:\n ");
		// map.put(C, null);
		System.out.print(B);
		while (map.get(B) != null) {
		System.out.print("->" + map.get(B));
		B = map.get(B);
	}
}
}
}

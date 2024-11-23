import java.util.*;

class SubSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the Array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
		System.out.println("The number of possible subarrays are:" + subarr(arr, target));
	}

	public static int subarr(int arr[], int target) {
		int count = 0;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == target) {
				printarray(arr, 0, i);
				count++;
			}
			if (map.containsKey(sum - target)) {
				printarray(arr, map.get(sum - target) + 1, i);
				count++;
			}
			map.put(sum, i);
		}
		return count;
	}

	public static void printarray(int arr[], int i, int j) {
		for (int k = i; k <= j; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}
}
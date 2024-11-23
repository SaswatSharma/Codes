import java.util.*;

public class Majority {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The number of elements that appear more than n/3 times are:" + find(arr, n));
  }

  public static int find(int arr[], int n) {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i])+1);
      } 
      else
        map.put(arr[i],1);
      if (map.get(arr[i])-(n/3)==1) {
        count++;
        System.out.println(arr[i]);
      }
    }
    return count;
  }
}
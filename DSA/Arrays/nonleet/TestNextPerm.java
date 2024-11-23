import java.util.*;

public class TestNextPerm {
    public static void main(String[] args) {
        Random random = new Random();
        int numTestCases = 500;
        
        for (int t = 0; t < numTestCases; t++) {
            // Generate a random array
            int n = random.nextInt(20) + 1;  // Size of the array (1 to 20)
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(100);  // Elements between 0 and 99
            }
            
            // Print the test case
            System.out.println("Test Case " + (t + 1) + ": " + Arrays.toString(arr));
            
            // Get the next permutation
            int[] nextPerm = perm(arr.clone());
            
            // Calculate the expected output using a different method
            int[] expected = calculateNextPermutation(arr.clone());
            
            // Compare the results
            if (!Arrays.equals(nextPerm, expected)) {
                System.out.println("Mismatch detected!");
                System.out.println("Original array: " + Arrays.toString(arr));
                System.out.println("Expected next permutation: " + Arrays.toString(expected));
                System.out.println("Your output: " + Arrays.toString(nextPerm));
            }
        }
    }

    public static int[] perm(int arr[]) {
         if(arr.length==1){
        return arr;
    }
        int i, j;
        for (i = arr.length - 2; i >=0; i--) {
            if (arr[i] < arr[i+1])
                break;
        }
        if(i==-1)
        {
            reversse(arr,0,arr.length-1);
            return arr;
        }
        for (j = arr.length - 1; j > i; j--) {
            if (arr[j] > arr[i]) {
                swap(arr, j, i);
                break;
            }
        }
        i++;
        j = arr.length - 1;
        reversse(arr,i,j);
        return arr;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reversse(int arr[],int i,int j)
    {
        while (i <= j) {
            swap(arr, i++, j--);
        }
    }

    // Helper function to calculate the next permutation manually
    public static int[] calculateNextPermutation(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i + 1, arr.length - 1);
        return arr;
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}

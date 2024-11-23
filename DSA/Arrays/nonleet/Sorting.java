import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ch;
        do {
            System.out.println("Enter the sorting technique with which you want to sort the array:");
            System.out.println("Enter 1 for Selection sort:");
            System.out.println("Enter 2 for Insertion sort:");
            System.out.println("Enter 3 for Quick Sort:");
            System.out.println("Enter 4 for Merge sort:");
            System.out.println("Enter 5 to exit:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println(Arrays.toString(select(arr)));
                    break;
                case 2:
                    System.out.println(Arrays.toString(insertion(arr)));
                    break;
                case 3:
                    System.out.println(Arrays.toString(quick(arr, arr.length - 1, 0)));
                    break;
                case 4:
                    System.out.println(Arrays.toString(mergesort(arr, 0, arr.length - 1)));
                    break;
                case 5:
                    System.out.println("Thanku visit again:");
                    break;
                default:
                    System.out.println("Maa chuda");
            }
        } while (ch != 5);
    }

    public static int[] mergesort(int arr[], int low, int high) {
        if (high > low) {
            int mid = low + (high - low) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, high, low, mid);
        }
        return arr;
    }

    public static void merge(int arr[], int high, int low, int mid) {
        int arr1[] = new int[(high - low) + 1];
        int i = low, j = mid + 1, k = -1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j])// if condition of equal to remains here then it makes it a stable algo)
            {
                arr1[++k] = arr[i];
                i++;
            }
            if (arr[j] < arr[i])// if condition of equal here,then algo becomes unstable
            {
                arr1[++k] = arr[j];
                j++;
            }
        }
        if (i > mid) {
            while (j <= high)
                arr1[++k] = arr[j++];
        }
        if (j > high) {
            while (i <= mid)
                arr1[++k] = arr[i++];
        }
        int d, l = 0;
        for (d = low; d <= high; d++) {
            arr[d] = arr1[l];
            l++;
        }
    }

    public static int[] quick(int arr[], int high, int low) {
        if (high > low) {
            int ele = arr[low];
            int pivot = partition(arr, ele, high, low);
            quick(arr, pivot-1, low);
            quick(arr, high, pivot + 1);
        }
        return arr;
    }

    public static int partition(int arr[], int ele, int high, int low) {
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] <= ele && i < arr.length - 1)
                i++;
            while (arr[j] > ele)
                j--;
            if (i <= j) {
                swap(i, j, arr);
                if (i == j)
                    i++;
                else {
                    i++;
                    j--;
                }
            }
            swap(low, j, arr);
        }
        return j;
    }

    public static int[] insertion(int arr[]) {
        int i, j = 0;
        for (i = 0; i <= (arr.length - 2); i++) {
            j = i + 1;
            while (j != 0) {
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1, arr);
                    j = j - 1;
                } else
                    break;
            }
        }
        return arr;
    }

    public static int[] select(int arr[]) {
        int maxind, last;
        for (int i = 0; i < arr.length - 1; i++) {
            last = arr.length - 1 - i;
            maxind = max(last, arr);
            swap(last, maxind, arr);
        }
        return arr;
    }

    public static int max(int l, int arr[]) {
        int m = 0;
        for (int i = 0; i <= l; i++) {
            if (arr[m] < arr[i])
                m = i;
        }
        return m;
    }

    public static void swap(int last, int maxind, int[] arr) {
        int temp = arr[last];
        arr[last] = arr[maxind];
        arr[maxind] = temp;
    }
}

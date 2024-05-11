import java.util.*;
public class Assign3_Heap {
    public static void heapSort(int [] arr) {
        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0; i--) {
            heapify(arr, N, i);
        }

        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int [] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index >= arr.length) {
            return;
        }
        arr[index] = scanner.nextInt();
        inputArray(arr, index + 1, scanner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Array: ");
        inputArray(arr, 0, scanner);
        heapSort(arr);
        System.out.println("Sorted: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

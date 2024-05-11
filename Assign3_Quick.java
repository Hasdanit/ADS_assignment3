import java.util.*;
public class Assign3_Quick {
        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            return i + 1;
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
            System.out.print("Length: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Elements: ");
            inputArray(arr, 0, scanner);
            quickSort(arr, 0, size - 1);
            System.out.println("Sorted result: ");
            for (int num : arr) {
                System.out.print(num + " ");
        }
    }
}


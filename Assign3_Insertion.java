import java.util.*;
public class Assign3_Insertion {
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
        insertionSort(arr);
        System.out.println("Sorted: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

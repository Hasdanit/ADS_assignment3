import java.util.*;
public class Assign3_Selection {
    public static void selectionSort(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        System.out.println("Sorted: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

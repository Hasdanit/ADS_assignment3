import java.util.*;
public class Assign3_Merge {
    public static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index >= arr.length) {
            return;
        }
        arr[index] = scanner.nextInt();
        inputArray(arr, index + 1, scanner);
    }
    public static int[] mergeSort(int[] src) {
        if (src.length <= 1) return src;
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements: ");
        inputArray(arr, 0, scanner);
        mergeSort(arr);
        System.out.println("Sorted result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

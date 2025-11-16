// Time complexity - O(n log n)

package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int index = 0;
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[index++] = arr[index1++];
            } else {
                merged[index++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            merged[index++] = arr[index1++];
        }
        while (index2 <= ei) {
            merged[index++] = arr[index2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, size - 1);
        System.out.println(Arrays.toString(arr));
    }
}

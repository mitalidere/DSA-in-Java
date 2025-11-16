package algorithms.searching;

import java.util.Scanner;

public class LinerSearch {
    public static int linerSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter element to be searched: ");
        int element = sc.nextInt();
        int index = linerSearch(arr, element);
        if(index!=-1) {
            System.out.print("Element found at index " + index);
        }
        else {
            System.out.print("Element not found");
        }
    }
}

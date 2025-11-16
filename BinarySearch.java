package algorithms.searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearchIterative(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(element==arr[mid]) {
                return mid;
            }
            else if(element<arr[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int [] arr, int element, int start, int end) {
        if(start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(element == arr[mid]) {
            return mid;
        }
        else if(element<arr[mid]) {
            return binarySearchRecursive(arr, element, start, mid-1);
        }
        else {
            return binarySearchRecursive(arr, element, mid+1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int element = sc.nextInt();
        int index = binarySearchIterative(arr, element);
//        int index = binarySearchRecursive(arr, element, 0, size-1);
        if (index != -1) {
            System.out.print("Element found at index " + index);
        } else {
            System.out.print("Element not found");
        }
    }
}

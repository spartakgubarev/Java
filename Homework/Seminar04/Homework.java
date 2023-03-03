package Homework.Seminar04;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 11, 13, 5, 6, 7 };
        System.out.println(Arrays.toString(arr));
        int size = arr.length;
        heapSort(arr, size);
    }

    public static void heapSort(int[] myArray, int length) {
        int temp;
        int size = length - 1;
        for (int i = (length / 2); i >= 0; i--) {
            heapify(myArray, i, size);
        }
        for (int i = size; i >= 0; i--) {
            temp = myArray[0];
            myArray[0] = myArray[size];
            myArray[size] = temp;
            size--;
            heapify(myArray, 0, size);
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void heapify(int[] myArray, int i, int heapsize) {
        int l = 2 * i;
        int r = 2 * i + 1;
        int largestElement;
        if (l <= heapsize && myArray[l] > myArray[i]) {
            largestElement = l;
        } else {
            largestElement = i;
        }

        if (r <= heapsize && myArray[r] > myArray[largestElement]) {
            largestElement = r;
        }

        if (largestElement != i) {
            int temp = myArray[i];
            myArray[i] = myArray[largestElement];
            myArray[largestElement] = temp;
            heapify(myArray, largestElement, heapsize);
        }
    }
}
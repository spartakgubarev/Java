package Homework.Seminar03;

import java.util.Arrays;;

// +Реализовать алгоритм сортировки слиянием
public class Homework {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 1, 6, 9, 8 };
        int[] newArr = sort(arr);

        System.err.println(Arrays.toString(arr));
        System.err.println(Arrays.toString(newArr));
    }

    // newArray - копирую оригинальный массив
    // tempArray - создаю хранилище для сортировки
    // rew -
    private static int[] sort(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int[] tempArray = new int[array.length];
        int[] res = merge(newArray, tempArray, 0, array.length);
        return res;
    }

    // startIndex - начальный индекс
    // endIndex - конечный индекс
    private static int[] merge(int[] newArray, int[] tempArray, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return newArray;
        }


        return newArray;
    }
}

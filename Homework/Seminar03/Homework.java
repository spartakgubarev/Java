package Homework.Seminar03;

import java.util.Arrays;;

// +Реализовать алгоритм сортировки слиянием
public class Homework {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 1, 6, 9, 8 };
        int[] newArr = sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    // newArray - копирую оригинальный массив
    // tempArray - создаю хранилище для сортировки
    // res - результирующий массив
    private static int[] sort(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int[] tempArray = new int[array.length];
        int[] res = merge(newArray, tempArray, 0, array.length);
        return res;
    }
    
    // startIndex - начальный индекс
    // endIndex - конечный индекс
    private static int[] merge(int[] newArray, int[] tempArray, int startIndex, int endIndex) {
        if (startIndex >= endIndex-1) {
            return newArray;
        }
        // делю массив пополам каждый рекурсивный вызов, пока деление равно или больше разницы между началом и концом массива.
        // Узнаю конец для первого подмассива и начало второго подмассива
        // sort1 - первый подмассив
        // sort2 - второй подмассив
        // midle - начало - конец для каждого разделения (середина)
        int midle = startIndex + (endIndex - startIndex) / 2;
        int[] sort1 = merge(newArray, tempArray, startIndex, midle);
        int[] sort2 = merge(newArray, tempArray, midle, endIndex);
        
        // Сортировка, слияние
        int index1 = startIndex;
        int index2 = midle;
        int destIndex = startIndex;
        
        int[] result = sort1 == newArray ? tempArray : newArray;
        while (index1 < midle && index2 < endIndex) {
            result[destIndex++] = sort1[index1] < sort2[index2]
                    ? sort1[index1++] : sort2[index2++];
        }
        while (index1 < midle) {
            result[destIndex++] = sort1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sort2[index2++];
        }
        return result;
    }
}

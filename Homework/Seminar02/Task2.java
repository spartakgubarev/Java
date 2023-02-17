// 2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package Homework.Seminar02;

import java.io.IOException;
import java.util.logging.*;
import java.util.Random;

public class Task2 {
    static Logger logger = Logger.getLogger(Task2.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("G:/Учеба/Разработчик/repo/Java/Homework/Seminar02/log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int countRandom = 20;
        int maxValue = 50;
        int[] arr = ranVal(countRandom, maxValue); // заполняем массив
        int[] sortArr = isSorting(arr); // отсортируем массив
        view(arr, sortArr); // показ массива
    }

    // заполняем массив случайными числами
    private static int[] ranVal(int count, int val) {
        int[] array = new int[count];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(val);
        }
        return array;
    }

    // вывод массивов на экран
    public static void view(int arr[], int[] newArr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    // метод сортировки пузырьком
    public static int[] isSorting(int[] arr) {
        int[] sortArr = arr.clone();
        int _temp;
        for (int i = 1; i < sortArr.length; i++) {
            for (int j = 1; j < sortArr.length; j++) {
                if (sortArr[j] < sortArr[j - 1]) {
                    _temp = sortArr[j - 1];
                    sortArr[j - 1] = sortArr[j];
                    sortArr[j] = _temp;
                }
                isLog(sortArr);
            }
        }
        return sortArr;
    }

    private static void isLog(int[] tempArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tempArr.length; i++) {
            sb.append(tempArr[i]).append(" ");
        }
        logger.info(sb.toString());

    }
}

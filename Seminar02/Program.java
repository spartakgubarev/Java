package Seminar02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Task 01
        // Дано четное число N > 0 и символы с1 и с2
        // Написать метод, который вернет строку длины N, которая состит из чередующихся
        // символов с1 и с2, начиная с с1.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число больше 0: ");
        int count = sc.nextInt();

        // int count = 10;
        StringBuilder sb = nameString(count);
        System.out.println(sb);
        sc.close();
    }

    public static StringBuilder nameString(int count) {
        String strText = "c1c2";
        StringBuilder s = new StringBuilder(strText);
        // String strName = "c1c2";
        for (int i = 1; i < count; i++) {
            s.append(strText);

        }

        return s;
    }
}

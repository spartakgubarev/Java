package Seminar02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Task 01
        // Дано четное число N > 0 и символы с1 и с2
        // Написать метод, который вернет строку длины N, которая состит из чередующихся
        // символов с1 и с2, начиная с с1.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число больше 0 и четное: ");
        int count = sc.nextInt();
        char sym1 = 'h';
        char sym2 = 'i';
        String strName = nameString(count, sym1, sym2);
        System.out.println(strName);
        sc.close();
    }

    private static String nameString(int num, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}

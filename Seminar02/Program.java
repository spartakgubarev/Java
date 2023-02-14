package Seminar02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Task 01
        // Дано четное число N > 0 и символы с1 и с2
        // Написать метод, который вернет строку длины N, которая состит из чередующихся
        // символов с1 и с2, начиная с с1.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Введите число больше 0 и четное: ");
        // int count = sc.nextInt();
        // char sym1 = 'h';
        // char sym2 = 'i';
        // String strName = nameString(count, sym1, sym2);
        // System.out.println(strName);
        // sc.close();
        // }

        // private static String nameString(int num, char c1, char c2) {
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < num / 2; i++) {
        // sb.append(c1).append(c2);
        // }
        // return sb.toString();
        // }

        // Task 02. Напишите метод, котрый сжимает строку. Пример: вход aaaabbbcdd ->
        // a4b3c1d2
        String strText = "aaaabbbcddd";
        stringCompression(strText);
    }

    private static void stringCompression(String text) {
        if (text != "") {
            StringBuilder sb = new StringBuilder();
            int index = 0;
            int count = 1;
            char element = text.charAt(0);
            System.out.println(index < text.length());
            while (index < text.length()) {
                if (index + 1 == text.length()) {
                    sb.append(element).append(count);
                } else {
                    if (element == text.charAt(index + 1)) {
                        count++;
                    } else {
                        sb.append(element).append(count);
                        count = 1;
                        element = text.charAt(index + 1);
                    }
                }
                index++;
            }
            System.out.println(text);
            System.out.println(sb);
        } else
            System.out.println("Строка пустая!");
    }
    
    // Task 03. Напишите мтод, который принимает на вход строку (String) и
    // определяет
    // является ли строка палиндромом (возвращает boolean значение).
    
}

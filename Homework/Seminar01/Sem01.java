// +Написать программу вычисления n-ого треугольного числа. url
// Tn = (n(n+1)) / 2
package Homework.Seminar01;

import java.util.Scanner;

public class Sem01 {
    public static void main(String[] args) {
        int n = getNumber();
        viewTriangle(n);
    }

    static Integer getNumber() {
        Scanner iScanner = new Scanner(System.in);
        int z = 0;
        boolean flag = false;
        while (flag == false) {
            System.out.printf("Введите сумму n первый натуральных чисел: ");
            if (iScanner.hasNextInt()) {
                z = iScanner.nextInt();
                flag = true;
            } else {
                System.out.println("n - может быть только числом!!!\nПопробуйте еще раз: ");
                iScanner.nextLine();
            }
        }
        iScanner.close();
        return z;

    }

    static void viewTriangle(int number) {
        int t;
        for (int i = 1; i <= number; i++) {
            t = (i * (i + 1)) / 2;
            for (int j = 0; j < i; j++) {
                System.out.print("o");
            }
            System.out.print(" - " + t);
            System.out.println();
        }
    }
}

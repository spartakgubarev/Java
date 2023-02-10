// if (sc.hasNextInt()) {
//     int number = sc.nextInt();
//     System.out.println("Спасибо! Вы ввели число " + number);
// } else {
//     System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
// }
// Возмем коэффициент К и проверим на валидные данные
package Project01;

import java.util.Scanner; // работа сканировать текст

public class koef_k {
    static Integer intKoef_k() {
        int z = 0;

        boolean flag = false;
        Scanner iScanner = new Scanner(System.in);
        while (flag == false) {
            System.out.printf("Введите коэффициент К: ");
            if (iScanner.hasNextInt()) {
                z = iScanner.nextInt();
                flag = true;
            } else {
                System.out.println("Коэффициент может быть только число!!!\nПопробуйте еще раз: ");
                iScanner.nextLine();
            }
        }
        iScanner.close();
        
        return z;
    }
}


        // ПРОВЕРКА НА СООТВЕТСТВИЕ ПОЛУЧАЕМОГО ТИПА
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int z = iScanner.nextInt();
        // System.out.println(z);
        // iScanner.close();
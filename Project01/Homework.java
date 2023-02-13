/**
 Задачи для самоконтроля
1. Задана натуральная степень k. Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена многочлен степени k. 
*Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
2. Даны два файла, в каждом из которых находится запись многочлена. Сформировать файл содержащий сумму многочленов.
*/
package Project01;

public class Homework {
    public static void main(String[] args) throws Exception {
        int koef = koef_k.intKoef_k(); // вернулся коэффициент К

        String str = "K=" + koef + " => ";
        System.out.println(str);

        for (int i = koef; i >= 0; i--) {
            int numRnd = rnd.intRND(); // вернулось случайное число от 0 до 100
            str += numRnd + "*x^" + i + " + ";
        }
        System.out.println(str);

    }

}

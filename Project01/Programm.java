package Project01;
// работа с файлами
// работа с файлами
// import java.io.*; // к модулю для работы с файлами чтение, вариант посимвольно

// import java.util.Scanner; // работа сканировать текст

/**
 * Programm
 */
public class Programm {
    public static void main(String[] args) throws Exception { // throws Exception - возможно будет ошибка, чтоб не писать try и бла бла бла
        // System.out.println("bye world"); // комментарий
        // System.out.println("Hello world!");
        // String s = " sd 2";
        // System.out.println(s);
        // short age = 10;
        // int salary = 123456; // 4 байта
        // System.out.println(age);
        // System.out.println(salary);
        // float e = 2.7f;
        // double pi = 3.141592653;
        // System.out.println(e);
        // System.out.println(pi);

        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch)); // false

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2); // true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3); // false

        // String msg = "Hello world";
        // System.out.println(msg);

        // var i = 123; // неявная типизация (компилятор присвоит ближайшей тип)
        // System.out.println(i);
        // System.out.println(getType(i));
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // i = 12_124_534;
        // System.out.println(i);
        // String q = "qwer";
        // System.out.println(q.charAt(1));
        // i = 1;
        // System.out.println(i++);
        // System.out.println(i);
        // System.out.println(++i);

        // i = 123;
        // System.out.println(i);
        // i = i-- - --i; // главный приоритет --i, а i++ вначале берет i, а потом
        // плюсует
        // System.out.println(i);

        // i = 123;
        // i = --i-i--;
        // System.out.println(i);

        // boolean x = 123 > 234;
        // System.out.println(x);
        // присваивание: =
        // арифметические: *, /, +, -, % - остаток от деления, ++ - плюс 1, -- - минут 1
        // (итерация)
        // операции сравнения: <, >, ==, !=, >=, <=
        // логические операции: || - конъюнкция, && - дизъенкция, ^ - разделительная
        // дизъюнкция, ! - инверсия
        // побитовые операции << - , >> - , & - , | - , ^ -

        // int a = 8;
        // 1000
        // a = a << 1 - битовый сдвиг на один в лево
        // System.out.println(a << 1);
        // 1000

        // a = 18;
        // 10010 - 18
        // a = a << 1 - битовый сдвиг на один в лево
        // System.out.println(a >> 1);
        // 01001 - 9

        // a = 5;
        // int b = 2;
        // System.out.println(a | b); // | (ИЛИ) - побитовое сложение
        // 101
        // 010
        // 111

        // a = 5;
        // b = 2;
        // System.out.println(a & b); // & (И) - побитовое умножение
        // 101
        // 010
        // 000

        // a = 5;
        // b = 2;
        // System.out.println(a ^ b); // ^ () - истина тогда, когда одно хотя бы истина
        // 101
        // 010
        // 111

        // && - оперсанта быстрая, если первое условие ложное, второе условие даже не
        // рассматривае
        // & - оперсанта быстрая, проверяет оба условия
        // то же самое и с | и || - все истинна, когда хотябы одно истинно

        // МАССИВЫ
        // int[] arr = new int[10];
        // System.out.println(arr.length);

        // arr = new int[] {1, 2, 3, 4, 5};
        // System.out.println(arr.length);
        // System.out.println(arr);

        // int[][] arra = new int[2][2]; // двумерный массив три строки и 5 столбцов
        // for (i = 0; i < arra.length; i++) {
        // for (int j=0; j < arra[i].length; j++) {
        // System.out.printf("%d ", arra[i][j]);
        // }
        // System.out.println();
        // }

        // ЗАБРАТЬ ДАННЫЕ ОТ ПОЛЬЗОВАТЕЛЯ - нужно сделать импорт import
        // java.util.Scanner;
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // ПРОВЕРКА НА СООТВЕТСТВИЕ ПОЛУЧАЕМОГО ТИПА
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int z = iScanner.nextInt();
        // System.out.println(z);
        // iScanner.close();

        // String ss = "qwe";
        // int aa = 123;
        // String qq = ss + aa;
        // System.out.println(qq);

        lib.sayHi();

        // int a = 11;

        // switch (a) {
        // case 1:
        // case 2:
        // case 3:
        // case 4:
        // System.out.println("a");
        // break;
        // case 10: System.out.println('b');
        // break;
        // }
        
        
        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 == 0) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < i ; j++) {
        //         System.out.print("*");

        //     }
        // System.out.println();
        // }
        // try (FileWriter fw = new FileWriter("Project01/file.txt", true)) { // false - создание нового, true - дозапись
        //     fw.write("line 1");
        //     fw.append('\n');
        //     fw.append('2');
        //     fw.append('\n');
        //     fw.append("line 3");
        //     fw.flush();

        // }
        // catch (IOException ex) {
        //     System.out.println(ex.getLocalizedMessage());
        // }
        // String[] arr = new String[] {"spartak", "sparta", "spart", "spar", "spa", "sp", "s"};
        // for (String item : arr) {
        //     System.out.println(item);
            
        // }
        // ЧТЕНИЕ, ВАРИАНТ ПОСИМВОЛЬНО
        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        //     char ch = (char) c;
        //     if (ch == '\n') {
        //         System.out.print(ch);
        //     } else {
        //         System.out.print(ch);
        //     }
        // }
        // ВАРИАНТ ПОСТРОЧНО
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        //     System.out.printf("== %s ==\n", str);
        // }
        // br.close();
    }

    // static String getType(Object o) {
    // return o.getClass().getSimpleName();
    // }

}


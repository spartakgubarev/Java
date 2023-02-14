package Seminar02;

// import java.util.Scanner;
import java.io.*;

public class Program {
    // public static void main(String[] args) {
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
        // String strText = "aaaabbbcddd";
        // stringCompression(strText);
    //     String text = "казак";
    //     boolean answer = palindrome(text);
    //     System.out.println(answer);
    // } // ------------------------- MAIN ------------------------------
    //
    // private static void stringCompression(String text) {
    // if (text != "") {
    // StringBuilder sb = new StringBuilder();
    // int index = 0;
    // int count = 1;
    // char element = text.charAt(0);
    // System.out.println(index < text.length());
    // while (index < text.length()) {
    // if (index + 1 == text.length()) {
    // sb.append(element).append(count);
    // } else {
    // if (element == text.charAt(index + 1)) {
    // count++;
    // } else {
    // sb.append(element).append(count);
    // count = 1;
    // element = text.charAt(index + 1);
    // }
    // }
    // index++;
    // }
    // System.out.println(text);
    // System.out.println(sb);
    // } else
    // System.out.println("Строка пустая!");
    // }

    // Task 03. Напишите метод, который принимает на вход строку (String) и
    // определяет
    // является ли строка палиндромом (возвращает boolean значение).
    // String text = "asdfggfdsa";
    // private static boolean palindrome(String pal) {
    //     char[] newPal = pal.toCharArray();
    //     Integer len = pal.length() / 2;
    //     for (int i = 0; i < len; i++) {
    //         if (newPal[i] == newPal[pal.length() - 1 - i]) {
    //         } else
    //             return false;
    //     }
    //     return true;
    // }


    // Task 04. ------------- сказали не делать ----------------------
    // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
    // который запишет эту строку в простой текстовый файл, обработайте исключения.


    // Task 05. Напишите метод, котрый вернет содержимое текущей папки в виде массива строк.
    // Напишите метод, который запишет массив, вовзвращенный предыдущим методом в файл.
    // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        
        String[] listFolder = isFolder(pathProject);
        for (int i = 0; i < listFolder.length; i++) {
            System.out.println(listFolder[i]);
        }
        
        isWriteFile(pathProject, listFolder);
        
    }
    // Метод возвращает содержимое текущей папки в виде массива строк
    private static String[] isFolder(String path) {
        File dir = new File(path);
        File[] arrFiles = dir.listFiles();
        String[] isArr = new String[arrFiles.length];
            for (int i = 0; i < arrFiles.length; i++) {
                isArr[i] = arrFiles[i].toString();
            }
            return isArr;
        }


    // Метод записи массива строк в файл
    private static void isWriteFile(String path, String[] isArr) {
        try {
        String pathFile = path.concat("/Seminar02/SpartakFile.txt");
        File file = new File(pathFile);

            // Create new file
            // if it does not exist
            if (file.createNewFile()) System.out.println("File created");
            else System.out.println("File already exists");
            
            FileWriter fileWriter = new FileWriter(file, true);
            for (int i = 0; i < isArr.length; i++) {
                fileWriter.write(isArr[i] + "\n");
            }
            // fileWriter.write("Sparta");
            // fileWriter.append("new line");

            fileWriter.flush();
            fileWriter.close();
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }

    // Task 06. Напишите метод, который определить тип (расширение) файлов из текущей папки и выведет в консоль результат вида
    // 1 Равширение файла: txt
    // 2 Расширение файла: pdf
    // 3 Равширение фала: 
    // 4 Расширение файла: jpg

}
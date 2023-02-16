package Homework.Seminar02;
import java.io.*;
// import java.util.Scanner;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Task1 {
    public static void main(String[] args) {
        StringBuilder request = new StringBuilder("SELECT * FROM students WHERE ");
        StringBuilder isArr = readFile();
        
        // System.out.println(request);
        System.out.println(isArr);
        
    }
    private static StringBuilder readFile() {
        String strJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder sb = new StringBuilder(strJson);
        StringBuilder sbNew = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
        //     System.out.println(sb.charAt(i));
        // }
        // char a = '{';
            if (sb.charAt(i) != (char)'{' &
                sb.charAt(i) != (char)'}'
            ) {
                // System.out.println(sb.charAt(i));
                sbNew.append(sb.charAt(i));
                
            }
        }
        // String[] strArr = strJson.split(",|:"); 
        
        
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < strArr.length; i++) {
        //     int indexOf = strArr[i].indexOf("null");
            
        //     if (i%2==0) {
        //         for (int j = 0; j < strArr[i].length(); j++) {
                    
        //         }
        //     }
            
        //     System.out.println(strArr[i]);
        // }
        

        // try (FileReader fr = new FileReader("G:/Учеба/Разработчик/repo/Java/Homework/Seminar02/task1.json")) {

        //     int c;
        //     int indexStart = Character.getNumericValue('{');
        //     int indexStop = Character.getNumericValue('}');
        //     while ((c = fr.read()) != -1) {
        //             sb.append((char)c);
                           
        //     }
        // } catch (IOException e) {
        //     System.out.println("Файла в такой директории не существует!");
        //     e.printStackTrace();
        // }
        System.out.println(sb);
    return sbNew;

    }
}

// while (scan.hasNextLine()) {
//     System.out.println(i + " : " + scan.nextLine());
//     i++;
// }
// SELECT * FROM students WHERE name = 'Ivanov' AND country = 'Russia' AND city = 'Moscow' AND age = 'null'

// try(FileReader reader = new FileReader("notes3.txt"))
// {
//     // читаем посимвольно
//      int c;
//      while((c=reader.read())!=-1){
          
//          System.out.print((char)c);
//      } 
//  }
//  catch(IOException ex){
      
//      System.out.println(ex.getMessage());
//  } 
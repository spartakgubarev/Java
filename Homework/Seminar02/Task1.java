package Homework.Seminar02;
// import java.io.*;
// import java.util.Scanner;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Task1 {
    public static void main(String[] args) {
        String textJson = "SELECT * FROM students WHERE ";
        StringBuilder request = new StringBuilder(textJson);
        StringBuilder isArr = request.append(transformation());
        
        System.out.println(isArr);
        
    }
    private static StringBuilder transformation() {
        String strJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] arr = strJson.split(",");
        StringBuilder sbNew = new StringBuilder();
        int index;
        for (int j = 0; j < arr.length; j++) {
            StringBuilder sb = new StringBuilder(arr[j]);
            if (arr[j].indexOf("null") == -1) {
                if (arr[j+1].indexOf("null") == -1) {
                    sb.append(" AND");
                }
                index = arr[j].indexOf(":");
                for (int i = 0; i < sb.length(); i++) {
                    if (sb.charAt(i) != (char)'{' &
                        sb.charAt(i) != (char)'}' &
                        (i > index | sb.charAt(i) != (char)'"')
                    ) {
                        sbNew.append(sb.charAt(i));
                    }
                }
            }
        }
    return sbNew;
    }
}

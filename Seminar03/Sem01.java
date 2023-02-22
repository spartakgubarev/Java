package Seminar03;

public class Sem01 {
    public static void main(String[] args) {
        int a = 3;
        int b = 18;
        int c = 2; // +1
        int d = 2; // *2

        int[] way = new int[b+1];
        way[a] = 1;

        for (int i = a+c; i <= b; i++) {
            way[i] = i % d ==0 ? way[i-c] + way[i/d] : way[i-c];
        }
        System.out.println(way[b]);
    }
}


// удалил случайно неотслеживаемые файлы, посмотреть еще раз лекцию

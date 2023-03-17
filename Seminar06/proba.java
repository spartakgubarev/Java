package Seminar06;

import java.util.LinkedList;
import java.util.Queue;

public class proba {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        Queue<Integer> aa = new LinkedList<>();
        aa.offer(x);
        aa.offer(y);
        System.out.println(aa.peek());
        System.out.println(aa.peek());

        System.out.println(aa.remove());

        System.out.println(aa.poll());
        System.out.println(aa.poll());
        System.out.println(aa.poll());  
        System.out.println(aa.size());
        

        // Queue<String> qq = new LinkedList<>();

        // qq.offer("Харьков");
        // qq.offer("Киев");
        // qq.offer("Кременчуг");
        // qq.offer("Львов");

        // String town;
        // while ((town = qq.poll()) != null) {
        //     System.out.println(town);
        // }
    }
}

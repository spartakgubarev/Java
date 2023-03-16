package Homework.Seminar06;

import java.util.LinkedList;
import java.util.Queue;

// алгоритм поиск в ширину
public class WaveAlgorithm {
    int x;
    int y;
    

    public int[][] find(int[][] map, int startX, int startY) {
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(startX);
        q.offer(startY);
        map[startX][startY] = 1;
        while (q.size() != 0) {
            x = q.poll();
            y = q.poll();
            if (map[x - 1][y] == -9) {
                q.offer(x - 1);
                q.offer(y);
                map[x - 1][y] = map[x][y] + 1;
            }

            if (map[x][y + 1] == -9) {
                q.offer(x);
                q.offer(y + 1);
                map[x][y + 1] = map[x][y] + 1;
            }

            if (map[x + 1][y] == -9) {
                q.offer(x + 1);
                q.offer(y);
                map[x + 1][y] = map[x][y] + 1;
            }

            if (map[x][y - 1] == -9) {
                q.offer(x);
                q.offer(y - 1);
                map[x][y - 1] = map[x][y] + 1;
            }
        }
        return map;
    }

}

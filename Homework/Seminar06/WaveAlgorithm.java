package Homework.Seminar06;

import java.util.LinkedList;
import java.util.Queue;

// алгоритм поиск в ширину
public class WaveAlgorithm {
    int x;
    int y;
    int startX;
    int startY;
    int exitX;
    int exitY;
    // int startX;
    // int startY;
    // int endX;
    // int endY;

    public int[][] find(int[][] map, int startX, int startY, int exitX, int exitY) {
        this.startX = startX;
        this.startY = startY;
        this.exitX = exitX;
        this.exitY = exitY;
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(startX);
        q.offer(startY);
        
        map[startX][startY] = 1;
        while (q.size() != 0) {
            x = q.poll();
            y = q.poll();

            if (map[x+1][y] == -3) {
                map[x+1][y] = map[x][y]+1;
                x++;
                break;
            }
            if (map[x][y+1] == -3) {
                map[x][y+1] =map[x][y]+1;
                y++;
                break;
            }
            if (map[x-1][y] == -3) {
                map[x-1][y] =map[x][y]+1;
                y--;
                break;
            }
            if (map[x][y-1] == -3) {
                map[x][y-1] =map[x][y]+1;
                y--;
                break;
            }



            if (map[x - 1][y] == -9)  {
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
        System.out.println(map[x][y]);
        
        return map;
    }
    public int setExitX(){
        return x;
    }
    public int setExitY(){
        return y;
    }

}

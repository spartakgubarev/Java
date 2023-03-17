package Homework.Seminar06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// алгоритм поиск в ширину
public class WaveAlgorithm {
    int count;
    ArrayList<Integer> road = new ArrayList<>();
    int[][] map;
    int x;
    int y;
    int startX;
    int startY;
    int exitX;
    int exitY;

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
            if (map[x + 1][y] == -3) {
                map[x + 1][y] = map[x][y] + 1;
                x++;
                break;
            }
            if (map[x][y + 1] == -3) {
                map[x][y + 1] = map[x][y] + 1;
                y++;
                break;
            }
            if (map[x - 1][y] == -3) {
                map[x - 1][y] = map[x][y] + 1;
                y--;
                break;
            }
            if (map[x][y - 1] == -3) {
                map[x][y - 1] = map[x][y] + 1;
                y--;
                break;
            }

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
        this.map = map;
        return map;
    }

    public void road() {
        while (map[x][y] > 1) {
            if (map[x + 1][y] == map[x][y] - 1) {
                x++;
                road.add(x);
                road.add(y);
            }
            if (map[x][y + 1] == map[x][y] - 1) {
                y++;
                road.add(x);
                road.add(y);
            }
            if (map[x - 1][y] == map[x][y] - 1) {
                x--;
                road.add(x);
                road.add(y);
            }

            if (map[x][y - 1] == map[x][y] - 1) {
                y--;
                road.add(x);
                road.add(y);
            }
        }
    }

    public int[][] newRoad(int[][] mapClear) {
        count = 1;
        for (int i = 0; i < road.size(); i += 2) {
            mapClear[road.get(i)][road.get(i + 1)] = count;
            count++;
        }
        return mapClear;
    }
}

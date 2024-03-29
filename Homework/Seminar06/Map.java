package Homework.Seminar06;

public class Map {
  // Создание карты (-1 стена), (-9 пустота), (-2 вход), (-3 выход)
  int[][] map;
  int[] start;
  int[] exit;

  public Map() {
    int[][] map = {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -9, -9, -9, -9, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -1, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -1, -1, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -1, -1, -1, -1, -1, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
    };
    this.map = map;
  }

  public int[][] getMap() {
    return map;
  }

  public void getStart(int x, int y) {
    map[x][y] = -2;
  }

  public void getExit(int x, int y) {
    map[x][y] = -3;
  }

}

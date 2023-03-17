package Homework.Seminar06;

public class printMap {
  int x;
  int y;

  public void mpPrint(int[][] map) {
    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        System.out.print(String.format("%5d", map[row][col]));
      }
      System.out.println();
    }
  }
}

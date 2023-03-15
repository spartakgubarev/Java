package Homework.Seminar06;

public class printMap {
    // Рисование карты
    // public printMap(){

    // }

  public void mpPrint(int[][] map) {
    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        System.out.print(map[row][col] + " ");
      }
      System.out.println();
    }
  }
}

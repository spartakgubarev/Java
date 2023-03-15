package Homework.Seminar06;

public class printMap {
    int x;
    int y;
    // Рисование карты
    // public printMap(){

    // }

  public void mpPrint(int[][] map) {
    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        
        // String.format("%5d", map[row][col])
        System.out.print(String.format("%5d", map[row][col]));

        // System.out.print(map[row][col] + " ");
        if (map[row][col] == -2) {
            x = row;
            y = col;
        }
      }
      System.out.println();
    }
    System.out.println(x);
    System.out.println(y);
  }
}

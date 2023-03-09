package Homework.Seminar05;

public class Sem05 {
  public static void main(String[] args) {
    int[][] labyrinth = getMap();
    printMap(labyrinth);
  }

  // Создание карты
  public static int[][] getMap() {
    return new int[][] {
        { -1, -1, -1, -1, -1, -1, -1 },
        { -1, 10, 10, 10, 10, 10, -1 },
        { -1, 10, 10, 10, 10, 10, -1 },
        { -1, 10, 10, 10, 10, 10, -1 },
        { -1, 10, 10, 10, 10, 10, -1 },
        { -1, 10, 10, 10, 10, 10, -1 },
        { -1, -1, -1, -1, -1, -1, -1 },
    };
  }

  // Рисование карты
  public static void printMap(int[][] map) {
    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        System.out.print(map[row][col]);
      }
    System.out.println();
    }
  }

}

package Homework.Seminar05;

public class Sem05 {
  public static void main(String[] args) {
    int[][] labyrinth = getMap();
    printMap(labyrinth);
    labyrinth = colorMap(labyrinth);

  }

  // Создание карты (-1 стена), (-9 пустота), (-2 вход), (-3 выход)
  public static int[][] getMap() {
    return new int[][] {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -9, -9, -9, -9, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -3, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -1, -9, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -1, -1, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -1, -1, -1, -1, -1, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -9, -1, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -9, -2, -1, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
    };
  }

  // Рисование карты
  public static void printMap(int[][] map) {
    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        System.out.print(map[row][col] + " ");
      }
      System.out.println();
    }
  }

  // Раскраска карты
  public static int[][] colorMap(int[][] mapLab) {
    for (int row = 0; row < mapLab.length; row++) {
      for (int col = 0; col < mapLab[row].length; col++) {
        switch (mapLab[row][col]) {
          case -1:
            System.out.print("#" +" ");
            break;
            case -9:
            System.out.print(" "+" ");
            break;
            case -2:
            System.out.print("@"+" ");
            break;
            case -3:
            System.out.print("&"+" ");
            break;

          default:
            break;
        }
        // if (mapLab[row][col] == -1) {
        //   System.out.println("#");
        // }
        // if (mapLab[row][col] == -9) {
        //   System.out.println(" ");
        // }
        // if (mapLab[row][col] == -) {
        //   System.out.println("#");
        // }

      }
      System.out.print("\n");
    }
    return mapLab;
  }

}

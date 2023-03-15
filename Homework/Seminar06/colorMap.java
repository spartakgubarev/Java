package Homework.Seminar06;

public class colorMap {
    // int row;
    // int col;

 // Раскраска карты
 public void mapColor(int[][] mapLab) {
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
      }
      System.out.print("\n");
    }
    // return mapLab;
  }
}

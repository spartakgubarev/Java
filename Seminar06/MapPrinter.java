package Seminar06;


class MapPrinter {

    public MapPrinter() {
    }
  
    public String rawData(int[][] map) {
      StringBuilder sb = new StringBuilder();
  
      for (int row = 0; row < map.length; row++) {
        for (int col = 0; col < map[row].length; col++) {
          sb.append(String.format("%5d", map[row][col]));
        }
        sb.append("\n");
      }
      // for (int i = 0; i < 3; i++) {
      //   sb.append("\n");
      // }
  
      return sb.toString();
    }
  
    public String mapColor(int[][] map) {
      StringBuilder sb = new StringBuilder();
  
      for (int row = 0; row < map.length; row++) {
        for (int col = 0; col < map[row].length; col++) {
          switch (map[row][col]) {
            case 0:
              sb.append(" ");
              break;
            case -1:
              sb.append("#");
              break;
            case -2:
              sb.append("@");
              break;
            case -3:
              sb.append("&");
              break;
            default:
              break;
          }
        }
        sb.append("\n");
      }
      // for (int i = 0; i < 3; i++) {
      //   sb.append("\n");
      // }
      return sb.toString();
    }
  }
package Seminar06;


public class Sem06 {
  public static void main(String[] args) {
    
    var mg = new MapGenerator();

    var aaa = new MapPrinter();

    System.out.println(aaa.mapColor(mg.getMap()));

    var lee = new WaveAlgorithm(mg.getMap());

    lee.Colorize(new Point2D(3, 3));

    // System.out.println();
    System.out.println(aaa.rawData(mg.getMap()));

    // System.out.println(mg.getMap());

    // System.out.println(aaa.mapColor(mg.getMap()));
    // lee.getRoad(new Point2D(10, 10), new Point2D(10, 20), new Point2D(10, 30));
  }
}


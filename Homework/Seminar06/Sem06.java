package Homework.Seminar06;

public class Sem06 {
  public static void main(String[] args) {
    var mp = new Map(); // класс создание массива карты
    
    var prin = new printMap(); // класс прорисовки карты

    var cl = new colorMap(); // класс расскраски карты
    
    prin.mpPrint(mp.getMap()); // отрисовка массива карты

    cl.mapColor(mp.getMap());


    
    // System.out.println(mpPrint(mp.getMap()));
    // printMap(mp.getMap());

    
    // int[][] labyrinth = getMap();
    // printMap(labyrinth);
    // labyrinth = colorMap(labyrinth);

  }
}

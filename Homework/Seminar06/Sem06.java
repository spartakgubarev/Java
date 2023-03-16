package Homework.Seminar06;

public class Sem06 {
  public static void main(String[] args) {
    var mp = new Map(); // класс создание массива карты
    var prin = new printMap(); // класс прорисовки карты
    var cl = new colorMap(); // класс расскраски карты
    var wave = new WaveAlgorithm(); // класс поиск пути

    prin.mpPrint(mp.getMap()); // отрисовка массива карты

    cl.mapColor(mp.getMap()); // отрисовка раскрашенной карты

    prin.mpPrint(wave.find(mp.getMap(), 12, 2)); // отрисова массива поиска в ширину

    cl.mapColor(wave.find(mp.getMap(), 12, 2)); // отрисовка раскрашенной карты

  }
}

package Homework.Seminar06;

public class Sem06 {
  public static void main(String[] args) {
    int[][] find;
    int startX = 12; // вход по X
    int startY = 2; // вход по Y
    int exitX = 12; // выход по X
    int exitY = 8; // выход по Y
        
    var mp = new Map(); // класс создание массива карты, установки входа и выхода
    var prin = new printMap(); // класс прорисовки карты
    var cl = new colorMap(); // класс расскраски карты
    var wave = new WaveAlgorithm(); // класс поиск пути
    
    mp.getStart(startX, startY); // установить в массиве вход
    mp.getExit(exitX, exitY); // установить в массиве выход

    prin.mpPrint(mp.getMap()); // отрисовка массива карты
    
    cl.mapColor(mp.getMap()); // отрисовка раскрашенной карты
    
    find = wave.find(mp.getMap(), startX, startY, exitX, exitY); // int[][] find массив со входом и выходом
    
    prin.mpPrint(find); // отрисова массива поиска в ширину
    
    cl.mapColor(find); // отрисовка раскрашенной карты

    // mp.getStart(12, 2);
    // System.out.println(wave.setExitX());
    // System.out.println(wave.setExitY());
    
  }
}

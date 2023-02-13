package Seminar01;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sem01 {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    // РґР°РЅ РјР°СЃСЃРёРІ С‡РёСЃРµР», РЅСѓР¶РЅРѕ СЃС„РѕСЂРјРёСЂРѕРІР°С‚СЊ РЅРѕРІСѓСЋ РІС‹Р±РѕСЂРєСѓ
    // РёР· С‚РѕР»СЊРєРѕ С‡РµС‚РЅС‹С… С‡РёСЃРµР»
    int len = getNumberByUser("Р’РІРµРґРёС‚Рµ РєРѕР»РёС‡РµСЃС‚РІРѕ СЌР»РµРјРµРЅС‚РѕРІ ");
    int[] items = createArray(len);
    fillArray(items, 10);
    print2(items);

    int evenCount = getCountEvenItems(items);
    int[] evenItems = getEvenItems(items, evenCount);
    print2(evenItems);
    System.out.println(Arrays.toString(items));
    System.out.println(Arrays.toString(evenItems));
  }

  // #region
  // 2.0 Р’РІРѕРґ С‡РёСЃР»Р°
  public static int[] createArray(int size) {
    return new int[size];
  }

  public static int getNumberByUser(String text) {
    System.out.print(text);
    return input.nextInt();
  }

  // 2.2 Р—Р°РїРѕР»РЅРµРЅРёРµ РјР°СЃСЃРёРІР°
  public static void fillArray(int[] col,int max) {
    int count = col.length;
    int index = 0;
    while (index < count) {
      col[index] = random.nextInt(max);
      index = index + 1;
    }
  }

  // 2.4 РџРµС‡Р°С‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚Р°
  public static String print(int[] data) {
    String output = "";
    int count = data.length;

    int index = 0;
    while (index < count) {
      output += data[index] + " ";
      index = index + 1;
    }
    return output;
  }

  // 2.4 РџРµС‡Р°С‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚Р°
  public static void print2(int[] data) {
    int count = data.length;

    int index = 0;
    while (index < count) {
      System.out.print(data[index] + " ");
      index = index + 1;
    }

  }

  // 2.3 РџРѕР»СѓС‡РµРЅРёРµ С‚РѕР»СЊРєРѕ С‡РµС‚РЅС‹С… С‡РёСЃРµР»
  public static int[] getEvenItems(int[] rawData, int countEvenElements) {
    int count = rawData.length;
    int[] evenItems = createArray(countEvenElements);

    int k = 0;

    for (int i = 0; i < count; i++) {
      if (rawData[i] % 2 == 0) {
        evenItems[k] = rawData[i];
        k++;
      }
    }
    return evenItems;
  }

  // 2.5 РџРѕР»СѓС‡РµРЅРёРµ РєРѕР»-РІР° С‡РµС‚РЅС‹С… С‡РёСЃРµР»
  static int getCountEvenItems(int[] array) {
    int length = array.length;
    int count = 0;
    for (int i = 0; i < length; i++) {
      if (array[i] % 2 == 0)
        count++;
    }
    return count;
  }
  // #endregion
}

// РґР°РЅ РјР°СЃСЃРёРІ С‡РёСЃРµР», РЅСѓР¶РЅРѕ СЃС„РѕСЂРјРёСЂРѕРІР°С‚СЊ РЅРѕРІСѓСЋ РІС‹Р±РѕСЂРєСѓ РёР· С‚РѕР»СЊРєРѕ С‡РµС‚РЅС‹С… С‡РёСЃРµР»
// 1. РЈС‚РѕС‡РЅСЏС‚СЊ РўР—
// 2. Р”РµРєРѕРјРїРѕР·РёС†РёСЏ

// 2.0 Р’РІРѕРґ С‡РёСЃР»Р°
// int <- String
// 2.1 РЎРѕР·РґР°РЅРёРµ РјР°СЃСЃРёРІР°
// int[] <- int
// 2.2 Р—Р°РїРѕР»РЅРµРЅРёРµ РјР°СЃСЃРёРІР°
// void <- int[], min, max
// 2.4 РџРµС‡Р°С‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚Р°
// void <- int[]
// string <- int[]

// 2.3 РџРѕР»СѓС‡РµРЅРёРµ С‚РѕР»СЊРєРѕ С‡РµС‚РЅС‹С… С‡РёСЃРµР»
// int[] <- int[], count
// 2.5 РџРѕР»СѓС‡РµРЅРёРµ РєРѕР»-РІР° С‡РµС‚РЅС‹С… С‡РёСЃРµР»
// int <- int[]

// 3. РђР»РіРѕСЂРёС‚Рј
// 4. РљРѕРґ
// 5. РўРµСЃС‚С‹

class MyList {
  int[] data = new int[0];

  public void append(int item) {
    int size = data.length;
    int[] t = new int[size + 1];
    for (int i = 0; i < size; i++) {
      t[i] = data[i];
    }
    t[size] = item;
    data = t;
  }

  public String print() {
    return Arrays.toString(data);
  }
}

class MyLinkedList {
  int value;
  MyLinkedList next;
}
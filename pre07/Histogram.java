import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Histogram {

  public static int[] histogram(int[] array){
    int[] counts = new int[100];
    for (int i = 0; i < array.length; i++) {
      int index = array[i];
      counts[index]++;
    }
    return counts;
  }

  public static void main(String[] args){
    int[] array = new int[99];
    Random random = new Random();
    for (int i = 0; i < array.length; i++){
      array[i] = random.nextInt(99);
    }

    System.out.println("Random array is " + Arrays.toString(array));
    int[] countArray = histogram(array);
    for (int i = 0; i < countArray.length; i++){
      System.out.println("Number: " + i + " Count: " + countArray[i]);
    }
  }
}
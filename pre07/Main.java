import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main{

  public static int inRange(int[] scores, int low, int high){
    int count = 0;
      for (int i = 0; i < scores.length; i++) {
          if (scores[i] >= low && scores[i] < high) {
              count++;
          }
      }
    return count;
  }

  public static int[] randomArray(int len){
    int [] array = new int[len];
    Random random = new Random();
    for (int i = 0; i < len ; i++){
      array[i] = random.nextInt(100);
    }
    return array;
  }

  public static void main(String[]args){
    int[] test = randomArray(30);
    int a = inRange(test, 90, 100);

    System.out.println(Arrays.toString(test));
    System.out.println(a);

    // int[] counts = new int[100];
    // for (int i = 0; i < test.length; i++) {
    //     int index = test[i];
    //     counts[index]++;
    // }

    // int[] counts = new int[100];
    // for (int i = 0; i < counts.length; i++) {
    //     counts[i] = inRange(scores, i, i + 1);
    // }
  }
}
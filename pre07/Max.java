import java.util.Arrays;
import java.util.Random;

public class Main{

  public static int indexOfMax(int[] array){
    int max = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i] > array[max]) max = i;
      }
      return max;
  }

  public static void main(String[] args){
    int[] array = new int[10];
    Random random = new Random();
    for (int i = 0; i < array.length; i++){
      array[i] = random.nextInt(100);
    }

    System.out.println("The array is " + Arrays.toString(array));
    int indexOfMaximum = indexOfMax(array);

    System.out.println("The index of the maximum element in the array is " + indexOfMaximum);
  }
}
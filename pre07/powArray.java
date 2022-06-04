import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class powArray{
  public static double[] randomArray(int len){
    Random random = new Random();
    double[] array = new double[len];
    for (int i = 0; i < array.length; i++){
      array[i] = random.nextInt(100);
    }
    return array;
  }

  public static double[] powArray(double[] a, int power){
    for (int i = 0; i < a.length; i++){
      a[i] = Math.pow(a[i], power);
    }
    return a;
  }

  public static double[] powTwo(double[] a){
    for (int i = 0; i < a.length; i++){
      a[i] = Math.pow(a[i], 2.0);
    }
    return a;
  }


  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("How many elements do you want?");
    int elements = scan.nextInt();
    System.out.println("What power do you want to raise it to?");
    int power = scan.nextInt();

    double[] array = randomArray(elements);
    double[] arr = new double[elements];
    for (int i = 0; i < elements; i++){
      arr[i] = array[i];
    }
    System.out.println("The original random array is " + Arrays.toString(array));
    double[] powerArray = powArray(array, power);
    System.out.println("The array to the power of " + power + " is " + Arrays.toString(powerArray));
    double[] powerTwoArray = powTwo(arr);
    System.out.println("The array to the power of 2 is " + Arrays.toString(powerTwoArray));
  }

}
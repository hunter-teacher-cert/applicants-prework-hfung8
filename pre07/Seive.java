import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main{

// It consists of testing whether n is a multiple of any integer between 2 and sqrt{n}.
  public static boolean isPrime(int number){
    int sqrt = (int) Math.sqrt(number) + 1;
    System.out.println(sqrt);
    for (int i = 2; i < sqrt ; i++){
      if ( number % i == 0){
        return false;
      }
    }
  return true;
}
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("What number do you want to stop at?");
    int num = scan.nextInt();

    boolean[] array = new boolean[num];
    for (int i = 0; i < array.length; i++){
      array[i] = true;
    }

    // System.out.println(Arrays.toString(array));
    for (int i = 2; i <= num -1 ; i++){
      array[i] = isPrime(i);
    }
    System.out.println("The array is " + Arrays.toString(array));
  }
}
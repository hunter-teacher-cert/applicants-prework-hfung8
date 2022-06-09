import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main{

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
    for (int i = 2; i <= num -1 ; i++){
      array[i] = isPrime(i);
    }
    System.out.println("The array is " + Arrays.toString(array));
  }
}
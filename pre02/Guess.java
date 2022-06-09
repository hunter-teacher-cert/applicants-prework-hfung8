import java.util.Scanner;
import java.util.Random;

public class Guess{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    System.out.print("I'm thinkin of a number between 1 and 100\n(including both). Can you guess what it is?\nType a number: ");
    int guess = scan.nextInt();

    System.out.println("Your guess is: " + guess);
    int randomInt = random.nextInt(100) + 1;

    System.out.println("The number I was thinking of is: " + randomInt);
    System.out.println("You were off by " + Math.abs(randomInt - guess));
  }
}
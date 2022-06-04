import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Craps {

  public static int roll(int num){
    Random random = new Random();
    int number = random.nextInt(num);
    // so that we don't ever get the number 0
    if (number == 0){
      number = roll(num);
    }
    return number;
  }

  public static int shoot(int num, int max){
    int[] turn = new int[max];
    for (int i = 0; i < num; i++){
      turn[i] = roll(max);
    }
    int sum = 0;
    for (int i = 0; i < turn.length; i++){
      sum += turn[i];
    }
    System.out.println("Shoot: " + sum);
    return sum;
  }

  public static boolean round(){
    int turns = 0;
    boolean flag = true;
    int turn = shoot(2,6);
    int point = turn;
     if (turn == 2 || turn == 3 || turn == 12){
      System.out.println("You shot a " + turn + " on the first try. That's Craps. You lose!");
      flag = false;
    } else if (turn == 7 || turn == 11){
      System.out.println("You shot a " + turn + " on the first try. That's a Natural. You win!");
      flag = true;
    } else {
      do {
        turns += 1;
        System.out.println("Took a turn!");
        turn = shoot(2,6);
        if (turn == point){
          System.out.println("You shot a " + point + " and it took you " + turns + " turns. You win!");
          return true;
        } else if (turn == 7){
          System.out.println("You shot a 7 you lose!");
          return false;
        }
       } while (turn != 7);
      }
    return flag;
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("How many rounds?");
    int rounds = scan.nextInt();

    boolean[] turns = new boolean[rounds];
    for (int i = 0; i < rounds; i++){
      turns[i] = round();
    }
    System.out.println("You either win or you didn't, true is you won the round, false is you lost the round " + Arrays.toString(turns));
  }
}
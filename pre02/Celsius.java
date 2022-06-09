import java.util.Scanner;

public class Celsius{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("What is temperature in Celsius?");
    double celsius = scan.nextDouble();

    double result = (((celsius * 9)/5) + 32);

    System.out.printf("%.1f celsius = %.1f fahrenheit", celsius, result);
  }
}
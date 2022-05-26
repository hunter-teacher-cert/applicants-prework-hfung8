import java.util.*;

public class Loops {

    public static double divisible(double whole, double half){
        double ans = ((half) + (whole/(half)))/2;
        return ans;
    }

    public static double squareRoot(double whole, double half){
        
        double x1 = divisible(whole, half);
        double x2 = divisible(whole, x1);
        double x3 = Math.abs(x2-x1);
        System.out.println(x1);
            if (x3 <= 0.0001){
                System.out.println("Square root closest is " + x2 + " the difference is " + x3);
            } else {
                squareRoot(whole, x1);
            } 
        return 0.0;
    }

    public static double pow(int number, double power){
        long pow = 1;
        for (int i = 0; i < power; i++){
            pow = pow * number;
        }
        return pow;
    }

    public static long factorial(int number){
        long fact = 1;
        for (int i = 1; i < number; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number.");
        double number = scan.nextDouble(); 
        System.out.println("Input the x0");
        double x0 = scan.nextDouble();
        squareRoot(number, x0);
        System.out.println("Input the number you want to raise");
        int number1 = scan.nextInt();
        System.out.println("Input the power which you want to raise");
        double power = scan.nextDouble();
        double ans = pow(number1, power);
        System.out.println("The number, " + number1 + " raised to the power, " + power + " is equal to " + ans);
        System.out.println("What is the number you want to use for factorial?");
        int num = scan.nextInt();
        long answer = factorial(num);
        System.out.println("The factorial of " + num + " is " + answer);

    }
}

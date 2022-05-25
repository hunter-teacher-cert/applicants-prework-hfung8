import java.util.*;
// Exercise 2 

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

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number.");
        double number = scan.nextDouble(); 
        System.out.println("Input the x0");
        double x0 = scan.nextDouble();
        squareRoot(number, x0);
    }
}

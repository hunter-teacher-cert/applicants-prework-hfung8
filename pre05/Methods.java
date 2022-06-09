import java.io.*;
import java.util.*;

public class Methods {

    public static boolean isDivisible(int first, int second){
        if ((first%second) == 0){
            return true;
            }
        return false;
    }

    public static boolean isTriangle(int num1, int num2, int num3){
        if (num1 > (num2 + num3)){
            return false;
        } else if (num2 > (num1 + num3)){
            return false;
        } else if (num3 > (num1 + num2)){
            return false;
        } else {
            return true;
        }
    }



    public static int ack(int m, int n){
       if (m == 0){
           return n + 1; 
       } else if (m > 0 && n == 0){
           return ack(m-1, 1);
       } else if (m > 0 && n > 0){
          return ack(m-1, ack(m, n-1));
       }
       return -1;
    }


    public static void answer(){
        System.out.println(isDivisible(10,5));
        System.out.println(isDivisible(9,2));
        System.out.println(isTriangle(4,5,7));
        System.out.println(ack(3,5));
    }

    public static void main(String[] args){
        Methods e = new Methods();
        e.answer();
    }

}

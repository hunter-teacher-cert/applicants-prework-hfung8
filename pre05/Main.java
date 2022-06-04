import java.io.*;
import java.util.*;

public class Main {

    public static boolean isDivisible(int first, int second){
        if ((first%second) == 0){
            return true;
            }
        return false;
    }

    public static void answer(){
        System.out.println(isDivisible(10,5));
        System.out.println(isDivisible(9,2));
    }

    public static void main(String[] args){
        Main e = new Main();
        e.answer();
    }

}

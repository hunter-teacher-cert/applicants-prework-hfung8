import java.io.*;
import java.util.*;

public class Beer {
  public static int beers(int numOfBeers){

    if (numOfBeers == 0){
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
      return 0; 
    }
    else {
    System.out.println(numOfBeers + " bottles of beer on the wall,");
    System.out.println(numOfBeers + " bottles of beer,");
    System.out.println("ya' take one down, ya' pass it around");
    System.out.println(numOfBeers - 1 + " bottles of beer on the wall.");
    System.out.println("\n");
    beers(numOfBeers - 1);
    return 0;
    }
  }

  public static void main(String[] args){
    System.out.print(beers(99));
  }
}

import java.lang.*;
import java.util.*;
import java.io.*;

public class ArrayListPractice {

  // 1
  public static ArrayList<Integer> randomTen() {
    ArrayList<Integer> n = new ArrayList<Integer>();
    Random rand = new Random();
    for(int i = 0; i < 10; i++) {
      n.add(rand.nextInt(20));
    }
    return n;
  }

  // 2
  public static ArrayList<Integer> smallerThanEight(ArrayList<Integer> inList) {
    ArrayList<Integer> newList = new ArrayList<Integer>();
    for(Integer i : inList) {
      if(i < 8) {
        newList.add(i);
      }
    }
    return newList;
  }

  public static void main(String[] args) {
    // 0
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    ArrayList<String> strings = new ArrayList<String>();
    strings.add("one");
    strings.add("two");
    strings.add("three");

    // 1
    System.out.println("1. " + randomTen().toString());
    // 2
    ArrayList<Integer> i = new ArrayList<Integer>(Arrays.asList(1,2,3,5,10,3));
    System.out.println("2. " + smallerThanEight(i).toString());
  }

}

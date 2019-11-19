package Algorithm.Easy;

import java.util.Arrays;

public class HeightChecker1051 {

  public static int sort(int list[]) {
    int height[] = list.clone();
    int count = 0;
    Arrays.sort(height);
    for(int i = 0; i < list.length; i++) {
      if(list[i] != height[i]) {
        count++;
      }
    }
    return count;
  }

  public static void main(String args[]) {
    int list[] = { 1, 1, 4, 2, 1, 3 };
    System.out.println(HeightChecker1051.sort(list));
  }
}

package Algorithm.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverage346 {

  //Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
  int size, windowSum, count = 0;

  Deque queue = new ArrayDeque<Integer>();

  MovingAverage346(int size) {
    this.size = size;
  }

  public double next(int val) {
    ++count;
    queue.add(val);
    int tail = count > size ? (int) queue.poll() : 0;
    windowSum = windowSum - tail + val;
    return windowSum * 1.0 / Math.min(size, count);
  }

  public static void main(String args[]) {
    int window = 3;
    MovingAverage346 m = new MovingAverage346(window);

    System.out.println( m.next(10));
    System.out.println( m.next(11));
    System.out.println( m.next(15));
    System.out.println( m.next(19));

  }
}





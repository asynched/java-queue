import utils.queue.Queue;
import utils.queue.strategies.FirstInFirstOutStrategy;
import utils.queue.strategies.LastInFirstOutStrategy;

public class App {
  public static void main(String[] args) {
    var queue = new Queue<Integer>();

    queue.push(1);
    queue.push(3);
    queue.push(5);
    queue.push(7);
    queue.push(9);

    queue.process(new FirstInFirstOutStrategy<>((element) -> {
      System.out.printf("FIFO: %d\n", element);
    }));

    queue.process(new LastInFirstOutStrategy<>((element) -> {
      System.out.printf("FILO: %d\n", element);
    }));
  }
}

package utils.queue.strategies;

import java.util.ArrayList;
import utils.Tuple;
import utils.queue.interfaces.iQueueCallback;

/**
 * FIFO queue strategy
 */
public class FirstInFirstOutStrategy<T> extends QueueStrategy<T> {
  /**
   * Constructs a new FIFO stragegy object with the given callback
   * 
   * @param callback A function to process the queue element
   */
  public FirstInFirstOutStrategy(iQueueCallback<T> callback) {
    super(callback);
  }

  @Override
  public Tuple<T, Integer> getElement(ArrayList<T> queueElements) {
    T element = queueElements.get(0);
    return new Tuple<>(element, 0);
  }
}

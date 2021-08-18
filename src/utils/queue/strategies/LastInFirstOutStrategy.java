package utils.queue.strategies;

import java.util.ArrayList;

import utils.Tuple;
import utils.queue.interfaces.iQueueCallback;

public class LastInFirstOutStrategy<T> extends QueueStrategy<T> {
  /**
   * Constructs a new LIFO stragegy object with the given callback
   * 
   * @param callback A function to process the queue element
   */
  public LastInFirstOutStrategy(iQueueCallback<T> callback) {
    super(callback);
  }

  @Override
  public Tuple<T, Integer> getElement(ArrayList<T> queueElements) {
    int index = queueElements.size() - 1;
    T element = queueElements.get(index);

    return new Tuple<>(element, index);
  }
}

package utils.queue.strategies;

import java.util.ArrayList;
import utils.Tuple;

public class FirstInFirstOutStrategy<T> extends QueueStrategy<T> {
  public FirstInFirstOutStrategy(iQueueCallback<T> callback) {
    super(callback);
  }

  @Override
  public Tuple<T, Integer> getElement(ArrayList<T> queueElements) {
    T element = queueElements.get(0);
    return new Tuple<>(element, 0);
  }
}

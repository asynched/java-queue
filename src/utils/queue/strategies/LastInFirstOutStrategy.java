package utils.queue.strategies;

import java.util.ArrayList;

import utils.Tuple;

public class LastInFirstOutStrategy<T> extends QueueStrategy<T> {
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

package utils.queue.strategies;

import java.util.ArrayList;
import utils.Tuple;
import utils.queue.interfaces.iQueueCallback;

/**
 * Abstract class that defines a processing strategy for a given queue
 */
public abstract class QueueStrategy<T> {
  public iQueueCallback<T> callback;

  /**
   * Constructor for the Queue strategy
   * 
   * @param callback Callback for processing the desired element of the queue
   */
  public QueueStrategy(iQueueCallback<T> callback) {
    this.callback = callback;
  }

  /**
   * Abstract method for getting an element of the queue
   * 
   * The main reason for this method's existance is so the base classes can
   * implement their own strategy on getting an element out of the queue
   * 
   * @param queueElements
   * @return A tuple containing the desired element of the queue and it's index
   */
  public abstract Tuple<T, Integer> getElement(ArrayList<T> queueElements);

}

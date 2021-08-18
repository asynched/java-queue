package utils.queue.strategies;

/**
 * Functional interface that defines a generic callback type for the
 * QueueStrategy class
 */
public interface iQueueCallback<T> {
  /**
   * Calls the defined callback passing the currently processed element
   * 
   * @param element
   */
  void call(T element);
}

package utils.queue;

import java.util.ArrayList;
import utils.queue.strategies.QueueStrategy;

/**
 * A queue data structure class
 */
public class Queue<T> {
  private ArrayList<T> elements;

  /**
   * Constructs a new Queue object
   */
  public Queue() {
    this.elements = new ArrayList<T>();
  }

  /**
   * Adds an element to the end of the queue
   * 
   * @param element An element to add to the end of the queue
   */
  public void push(T element) {
    this.elements.add(element);
  }

  /**
   * Processes an element of the queue with the given strategy
   * 
   * @param strategy Strategy to process the array element
   */
  public void process(QueueStrategy<T> strategy) {
    var queueElementTuple = strategy.getElement(this.elements);
    strategy.callback.call(queueElementTuple.first);
    this.cleanupQueue(queueElementTuple.second);
  }

  /**
   * Removes the element in the index passed from the queue elements
   * 
   * @param index Index of the item to remove from the queue
   */
  private void cleanupQueue(int index) {
    var newElements = new ArrayList<T>();

    for (int i = 0; i < this.elements.size(); ++i) {
      if (i != index) {
        newElements.add(this.elements.get(i));
      }
    }

    this.elements = newElements;
  }
}

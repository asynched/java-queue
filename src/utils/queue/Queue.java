package utils.queue;

import java.util.ArrayList;
import utils.queue.strategies.QueueStrategy;

public class Queue<T> {
  private ArrayList<T> elements;

  public Queue() {
    this.elements = new ArrayList<T>();
  }

  public void push(T element) {
    this.elements.add(element);
  }

  public void process(QueueStrategy<T> strategy) {
    var queueElementTuple = strategy.getElement(this.elements);
    strategy.callback.call(queueElementTuple.first);
    this.cleanupQueue(queueElementTuple.second);
  }

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

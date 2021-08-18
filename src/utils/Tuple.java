package utils;

/**
 * Tuple object
 */
public class Tuple<T, R> {
  public T first;
  public R second;

  /**
   * Constructs a tuple element
   * 
   * @param first  An element to be stored
   * @param second An element to be stored
   */
  public Tuple(T first, R second) {
    this.first = first;
    this.second = second;
  }

}

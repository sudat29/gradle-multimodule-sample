package org.indepth.gms.consumer;

/**
 * Created by sud on 14/4/19.
 */
public interface Consumer<T> {
  void consume(T obj);
}

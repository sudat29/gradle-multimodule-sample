package org.indepth.gms.producer;

/**
 * Created by sud on 14/4/19.
 */
public class IntProducer implements Producer<Integer> {
  @Override
  public Integer produce() {
    System.out.println("Producing integer...");
    return 1;
  }
}

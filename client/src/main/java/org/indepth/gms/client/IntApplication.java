package org.indepth.gms.client;

import org.indepth.gms.consumer.IntConsumer;
import org.indepth.gms.producer.IntProducer;

/**
 * Created by sud on 14/4/19.
 */
public class IntApplication {
  public static void main(String[] args) {
    IntProducer producer = new IntProducer();
    IntConsumer consumer = new IntConsumer();
    consumer.consume(producer.produce());
  }
}

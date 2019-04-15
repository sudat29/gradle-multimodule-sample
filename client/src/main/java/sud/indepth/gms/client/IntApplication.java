package sud.indepth.gms.client;

import sud.indepth.gms.consumer.IntConsumer;
import sud.indepth.gms.producer.IntProducer;

/**
 * Created by sud on 14/4/19.
 */
public class IntApplication {
  public static void main(String[] args) {
    System.out.println("Starting client...");
    IntProducer producer = new IntProducer();
    IntConsumer consumer = new IntConsumer();
    consumer.consume(producer.produce());
  }
}

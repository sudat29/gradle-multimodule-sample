package sud.indepth.gms.consumer;

/**
 * Created by sud on 14/4/19.
 */
public class IntConsumer implements Consumer<Integer> {
  @Override
  public void consume(Integer i) {
    System.out.println("Consuming integer:" + i);
  }
}

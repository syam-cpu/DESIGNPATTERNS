package CricBuzz_Better.Subscribers;

import CricBuzz_Better.Producer.Producer;

public interface Subscriber {
    void update(Producer producer);
}

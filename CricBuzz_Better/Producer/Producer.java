package CricBuzz_Better.Producer;

import CricBuzz_Better.Models.Match;
import CricBuzz_Better.Subscribers.Subscriber;

public interface Producer {
    Match getMatchData();
    
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}

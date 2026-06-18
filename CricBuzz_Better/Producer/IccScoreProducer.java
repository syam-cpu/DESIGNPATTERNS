package CricBuzz_Better.Producer;

import java.util.ArrayList;
import java.util.List;

import CricBuzz_Better.Models.Match;
import CricBuzz_Better.Subscribers.ScoreBoardSubscriber;
import CricBuzz_Better.Subscribers.Subscriber;

public class IccScoreProducer implements Producer {
    private Match match;
    private List<Subscriber> subscribers;

    public IccScoreProducer(Match match)
    {
        this.match = match;
        this.subscribers = new ArrayList<Subscriber>();
    }

    public void scoreUpdated(String runs, String over, String ball, String wickets, boolean isFirstInnings)
    {
        // some api or some mechanism to fetch the data.
        this.scoreBoardSubscriber.update(this);
    }

    @Override
    public Match getMatchData() {
        return match;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber sub : this.subscribers)
        {
            sub.update(this);
        }
    }
}
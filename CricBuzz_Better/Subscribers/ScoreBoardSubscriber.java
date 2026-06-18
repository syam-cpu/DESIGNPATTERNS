package CricBuzz_Better.Subscribers;

import CricBuzz_Better.Models.Innings;
import CricBuzz_Better.Models.Match;
import CricBuzz_Better.Producer.Producer;

public class ScoreBoardSubscriber implements Subscriber{
    

    private Match match;

    public ScoreBoardSubscriber(Match match)
    {
        this.match = match;
    }

    @Override
    public void update(Producer producer) {
        boolean isFirstInnings = producer.getMatchData().getFirstInnings();
        Innings inningsProducer =  (isFirstInnings) ? producer.getMatchData().getInnings() : producer.getMatchData().getInnings2();
        Innings inningsSubscriber = (isFirstInnings) ? this.match.getInnings()  : this.match.getInnings2();

        inningsSubscriber.setCurrentScore(inningsProducer.getCurrentScore());
        inningsSubscriber.setCurrentBall(inningsProducer.getCurrentBall());
        inningsSubscriber.setCurrentOver(inningsProducer.getCurrentOver());
        inningsSubscriber.setWickets(inningsProducer.getWickets());    
    }
    
}

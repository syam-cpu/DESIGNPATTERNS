package CricBuzz_Better.Producer;

import CricBuzz_Better.Models.Match;
import CricBuzz_Better.Subscribers.ScoreBoardSubscriber;

public class IccScoreProducer {
    private Match match;
    private ScoreBoardSubscriber  scoreBoardSubscriber;


    public IccScoreProducer(Match match, ScoreBoardSubscriber scoreBoardSubscriber)
    {
        this.match = match;
        this.scoreBoardSubscriber = scoreBoardSubscriber;
    }

    public void scoreUpdated(String runs, String over, String ball, String wickets, boolean isFirstInnings)
    {
        // some api or some mechanism to fetch the data.
        this.scoreBoardSubscriber.update(over, ball, wickets, runs, isFirstInnings);
    }
}
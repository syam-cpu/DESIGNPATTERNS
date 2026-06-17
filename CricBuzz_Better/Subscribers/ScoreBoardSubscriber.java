package CricBuzz_Better.Subscribers;

import CricBuzz_Better.Models.Innings;
import CricBuzz_Better.Models.Match;

public class ScoreBoardSubscriber {
    

    private Match match;

    public ScoreBoardSubscriber(Match match)
    {
        this.match = match;
    }

    public void update(String CurrentOver, String currentBall, String wickets, String currentScore, boolean isFirstInnings)
    {
        Innings innings =  (isFirstInnings) ? this.match.getInnings() : this.match.getInnings2();
        
        innings.setCurrentOver(CurrentOver);
        innings.setCurrentBall(currentBall);

        innings.setWickets(wickets); 
        innings.setCurrentScore(currentScore);

        
    }
    
}

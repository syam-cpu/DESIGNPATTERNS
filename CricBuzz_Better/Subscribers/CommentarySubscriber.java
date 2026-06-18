package CricBuzz_Better.Subscribers;

import java.util.ArrayList;
import java.util.List;

import CricBuzz_Better.Producer.Producer;

public class CommentarySubscriber implements Subscriber{

    private List<String> commentary;
    private List<Producer> producers;

    public CommentarySubscriber(List<Producer> producers)
    {
        commentary = new ArrayList<String>();
    }

    @Override
    public void update(Producer producer) {
        this.commentary.add(producer.getMatchData().getCommentary().get(producer.getMatchData().getCommentary().size()-1));
    }
    
}

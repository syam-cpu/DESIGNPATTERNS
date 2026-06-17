package CricBuzz_Better.Models;

public class Innings {
    private String currenOver;
    private String currentBall;
    private String currentRunRate;
    private String currentScore;
    private String wickets;

    public void setCurrentOver(String currenOver)
    {
        this.currenOver = currenOver;
    }

    public void setCurrentBall(String currentBall)
    {
        this.currentBall = currentBall;
    }

    public void setCurrentRunRate(String currentRunRate)
    {
        this.currentRunRate = currentRunRate;
    }

    public void setCurrentScore(String currentScore)
    {
        this.currentScore = currentScore;
    }

    public void setWickets(String wickets)
    {
        this.wickets = wickets;
    }

    public String getCurrentOver()
    {
        return currenOver;
    }

    public String getCurrentBall()
    {
        return currentBall;
    }

    public String getCurrentRunRate()
    {
        return currentRunRate;
    }

    public String getCurrentScore()
    {
        return currentScore;
    }

    public String getWickets()
    {
        return wickets;
    }
}

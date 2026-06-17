package CricBuzz_Better.Models;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private String matchId;
    private Team team1;
    private Team team2;
    private String venue;
    private String date;
    private String time;
    private String status;
    private Innings innings1;
    private Innings innings2;
    private List<String> commentary;   

    public Match(String matchId, Team team1, Team team2, String venue, String date, String time, String status, Innings innings1, Innings innings2)
    {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.status = status;
        this.innings1 = innings1;
        this.innings2 = innings2;
        this.commentary = new ArrayList<String>();

    }

    public void setCommentary(List<String> commentary)
    {
        this.commentary = commentary;
    }

    public void setMatchId(String matchId)
    {
        this.matchId = matchId;
    }

    public void setTeam1(Team team1)
    {
        this.team1 = team1;
    }

    public void setTeam2(Team team2)
    {
        this.team2 = team2;
    }

    public void setVenue(String venue)
    {
        this.venue = venue;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setInnings(Innings innings)
    {
        this.innings1 = innings;
    }

    public void setInnings2(Innings innings)
    {
        this.innings2 = innings;
    }

        
    public String getMatchId()
    {
        return matchId;
    }

    public Team getTeam1(){
        return team1;
    }

    public Team getTeam2()
    {
        return team2;
    }

    public String getVenue()
    {
        return venue;
    }

    public String getDate()
    {
        return date;
    }

    public String getTime()
    {
        return time;
    }

    public String getStatus()
    {
        return status;
    }

    public Innings getInnings()
    {
        return innings1;
    }

    public Innings getInnings2()
    {
        return innings2;
    }

    public List<String> getCommentary()
    {
        return commentary;
    }

}

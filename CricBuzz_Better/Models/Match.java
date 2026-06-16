package CricBuzz_Better.Models;

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

    public String getMatchId()
    {
        return matchId;
    }
}

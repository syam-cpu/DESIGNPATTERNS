package CricBuzz_Better.Models;

import java.util.List;

public class Team {
    private String name;
    private String teamId;
    private List<Player> players;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setTeamId(String teamId)
    {
        this.teamId = teamId;
    }

    public void setPlayers(List<Player> players)
    {
        this.players = players;
    }

    public String getName()
    {
        return this.name;
    }

    public String getTeamId()
    {
        return this.teamId;
    }

    public List<Player> getPlayers()
    {
        return this.players;
    }
}

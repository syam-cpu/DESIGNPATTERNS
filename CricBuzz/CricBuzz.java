package CricBuzz;

public class CricBuzz {
    private int runs;
    private int wickets;
    private int overs;
    private IccApiService iccApiService; // violates the dip

    public CricBuzz()
    {
        this.iccApiService = new IccApiService(10, 0, 1);
    }

    public void updateScore(int runs, int wickets, int overs)
    {
        while(true)
        {
            iccApiService.updateScore(runs, wickets, overs);

            // we can write a logic to check if the runs or wickts or overs are updated.
            //then we update them also.

            if (this.overs !=  iccApiService.getOvers())
            {
                this.runs = iccApiService.getRuns();
                this.wickets = iccApiService.getWickets();
                this.overs = iccApiService.getOvers();
                System.out.println("Runs: " + this.runs + "Wickets " + this.wickets + "Overs: " + this.overs);
            }
        }
    }

}

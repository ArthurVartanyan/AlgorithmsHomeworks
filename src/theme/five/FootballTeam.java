package theme.five;

public class FootballTeam {

    private String teamName;

    private int goalCountBySeason;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getGoalCountBySeason() {
        return goalCountBySeason;
    }

    public void setGoalCountBySeason(int goalCountBySeason) {
        this.goalCountBySeason = goalCountBySeason;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "teamName='" + teamName + '\'' +
                ", goalCountBySeason=" + goalCountBySeason +
                '}';
    }
}
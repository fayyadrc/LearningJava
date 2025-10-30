
import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private String conference;
    private List<Player> players;

    public Team(String name, String conference) {
        this.teamName = name;
        this.conference = conference;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return teamName;
    }

    public String getConference() {
        return conference;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public static List<Team> populateTeams(String[][] data) {
        ArrayList<Team> teamList = new ArrayList<>();
        for (String[] row : data) {
            String teamName = row[0];
            String conference = row[1];
            Team team = new Team(teamName, conference);
            teamList.add(team);
        }
        return teamList;
    }

    public void printTeam() {
        System.out.println("Team Name: " + getName() + ", Conference: " + getConference());

    }

    public static void printTeamData(Team team) {
        System.out.println(" " + team.getName() + "\n--Players:");
        for (Player player : team.getPlayers()) {
            System.out.println(" --- " + player.getName());
        }
    }

}

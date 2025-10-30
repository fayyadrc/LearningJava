import java.util.ArrayList;
import java.util.List;


// input:  (1, "2001-06-06", teams.get(0), teams.get(1), 18997)
public class Game {
    private Team awayTeam;
    private Team homeTeam;
    private int gameNumber;
    private String date;
    private int attendance;

    public Game(int gameNumber,String date, Team homeTeam, Team awayTeam, int attendance){
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.gameNumber = gameNumber;
        this.date = date;
        this.attendance = attendance;
    }

    public int getGameNumber(){
        return gameNumber;
    }

    public String getDate(){
        return date;
    }

    public Team getHomeTeam(){
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public static List<Game> populateGames(List<Team> teams, String[][] gameData){
        List<Game> gameList = new ArrayList<>();
        for (String[] data : gameData){
            int gameNumber = Integer.parseInt(data[0]);
            String date = data[1];
            Team homeTeam = teams.get(Integer.parseInt(data[2]));
            Team awayTeam = teams.get(Integer.parseInt(data[3]));
            int attendance = Integer.parseInt(data[4]);
            
            Game Game = new Game(gameNumber, date, homeTeam, awayTeam, attendance);
            gameList.add(Game);
        }
        return gameList;
    }

    public void printGameDetails(){
        System.out.println("Game " + getGameNumber());
        System.out.println("Date " + getDate());

        System.out.print("Home Team: ");
        Team.printTeamData(homeTeam);

        System.out.print("Away Team: ");
        Team.printTeamData(awayTeam);
    }

}

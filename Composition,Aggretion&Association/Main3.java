
import java.util.ArrayList;
import java.util.List;

class Player{
    private int id;
    private String team;
    private String name;

    public Player(int id, String team, String name){
        this.id = id;
        this.team = team;
        this.name = name;
    }


}

//team class contains a list of player objects
class Team {
    private String name;
    private List<Player> players;

    public Team(String name){
        this.name = name;
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayer(){
        return this.players;
    }
    

}

//school class contains a list of team
class School {
    private String schoolName;
    private List<Team> teams;

    public School(String schoolName){
        this.schoolName=schoolName;
        this.teams = new ArrayList<>();
    }
    
    public int getTotalPlayersInSchool(){
        int totalPlayers = 0;
        for (Team team : this.teams){
            totalPlayers += team.getPlayer().size();
        }

        return totalPlayers;
    }
    
}







public class Main3 {

    public static void main(String[] args){
        Player player1 = new Player(1,"Blue", "Jon Snow");
        Player player2 = new Player(1,"Green", "Robb Stark");
        Player player3 = new Player(1,"Red", "Arya Stark");
        Player player4 = new Player(1,"Yellow", "Daenyrs Targaryan");

    }
    
}

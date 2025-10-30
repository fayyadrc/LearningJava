import java.util.ArrayList;
import java.util.List;

public class Player{
    private String playerName;
    private int playerNumber;

    public Player(String playerName, int playerNumber){
        this.playerName = playerName;
        this.playerNumber=playerNumber;
    }

    public String getName() {
        return playerName;
    }

    public int getNumber() {
        return playerNumber;
    }

    public static List<Player> populatePlayers(String[][] data, int teamCounter){
        ArrayList<Player> playerList = new ArrayList<>();
        for (String[] row : data){
            if (row == null || row.length < 3) continue;
            int teamID = Integer.parseInt(row[0]);
            if (teamCounter == teamID){
                String playerName = row[1];
                int playerNumber = Integer.parseInt(row[2]);
                Player player = new Player(playerName, playerNumber);
                playerList.add(player);
            }
        }
        return playerList;
    }

    public void printPlayer(){
        System.out.println("Player Name: " + this.playerName + ", Player Number: " + this.playerNumber);
    }
}

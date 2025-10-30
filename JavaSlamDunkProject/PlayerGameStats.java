public class PlayerGameStats {
    private Game game;
    private Player player;
    private int fieldGoals;
    private int threePoints;
    private int freeThrows;
    private int offensiveRebounds;
    private int defensiveRebounds;
    private int assists;
    
    public PlayerGameStats(Game game, Player player, int fieldGoals, int threePoints,int freeThrows,int offensiveRebounds, int defensiveRebounds, int assists){
        this.game = game;
        this.player = player;
        this.fieldGoals = fieldGoals;
        this.threePoints= threePoints;
        this.freeThrows = freeThrows;
        this.offensiveRebounds = offensiveRebounds;
        this.defensiveRebounds = defensiveRebounds;
        this.assists = assists;
    }

    public Player getPlayer() {
        return player;
    }

    public int getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public int getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public int getAssists() {
        return assists;
    }

    public int getPlayerGameScore(){
        return (fieldGoals * 2) + (threePoints * 3) + freeThrows;
    }
    
    
}



 
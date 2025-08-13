package homework_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        if (this.currentPlayers < maxPlayers) {
            this.currentPlayers = this.currentPlayers + 1;
        }
    }

    void printGameStatus() {
        System.out.println("The game's name: " + this.gameName + ", Current players number: " + this.currentPlayers + ", Max number of players: " + maxPlayers);
    }




}

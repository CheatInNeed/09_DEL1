import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        
        int numberOfPlayers = 2;
        
        for (int i = 1; i <= numberOfPlayers; i++) {
            Player player = new Player();
            System.out.println("Enter name for player " + i + ":");
            player.setName(scanner.nextLine());
            players.add(player);
        }
        
        Game.startGame(players, scanner);
    }
}
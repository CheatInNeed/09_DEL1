import java.util.List;

public class Game extends Player {
    public static void startGame(List<Player> players, Scanner scanner){
        String input;

            while (true) {
                for (Player player : players) {
                    System.out.println(player.getName() + "'s turn!");
                    input = scanner.nextLine();

                    if (input.equals("r")) {
                        player.rollDice();
                        if (player.getIsEns() && player.getDie1() == 1) {
                            player.dropPoints();
                        } else if (player.getIsEns() && !(player.getDie1() == 1)) {
                            
                        }
                    }
                }
            }
    }
}

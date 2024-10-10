import java.util.List;
import java.util.Scanner;

public class Game extends Player {
    public static void startGame(List<Player> players, Scanner scanner){
        String input;
            outerLoop:
            while (true) {
                for (Player player : players) {
                    System.out.println(player.getName() + "'s turn!");
                    input = scanner.nextLine();

                    if (input.equals("r")) {
                        player.rollDice();
                        System.out.println(player.getName()+" rolled "+player.getDie1()+" & "+player.getDie2());
                        if (player.getIsEns() && player.getDie1() == 1) {
                            player.dropPoints();
                            System.out.println(player.getName()+" has lost all points :(");
                        } else if (player.getIsEns() && !(player.getDie1() == 1)) {
                            player.rollDice();
                            System.out.println(player.getName()+" got extra turn!");
                            if (player.getIsEns() && player.getDie1() == 6 && player.getPrevDie1() == 6) {
                                System.out.println(player.getName()+" won, rolled 6's twice!!!");
                                break outerLoop;
                            }
                            System.out.println(player.getName()+" rolled again, "+player.getDie1()+" & "+player.getDie2());                        } 
                    } else if (input.equals("stop")) {
                        break outerLoop;
                    }
                }
                for (Player player : players) {
                    System.out.println(player.getName() + ": " + player.getTotalPoints());
                    if (Rules.isWinning(player.getTotalPoints())) {
                        System.out.println(player.getName() + " WON: " + player.getTotalPoints());
                        System.out.println("Total score of players:");
                        for (Player player2 : players) {
                            System.out.println(player2.getName()+": "+player2.getTotalPoints());
                        }
                        scanner.close();
                        return;
                    }
                }
                System.out.print("\n");
            }
    }
}

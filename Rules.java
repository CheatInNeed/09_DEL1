public class Rules{
    final int winningScore = 40;

    boolean isWinning(int score){
        if (score >= winningScore){
            return true;
        }
        else {
            return false;
        }
    }

}
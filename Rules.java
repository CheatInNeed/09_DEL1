public class Rules{
    static final int winningScore = 40;

    static boolean isWinning(int score){
        if (score >= winningScore){
            return true;
        }
        else {
            return false;
        }
    }

}
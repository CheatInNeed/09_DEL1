import java.util.Random;

public class DiceCup extends TotalPoints{
    Random rand = new Random();

   int die1;
   int die2;

    int prevDie1;
    int prevDie2;

    int roundNr = 0;

        void rollDice (){
            prevDie2 = die2;
            prevDie1 = die1;
            die1 = rand.nextInt(1, 7);
            die2 = rand.nextInt(1, 7);
            roundNr++;
        }
        int getSum(){
            int sum = die1 + die2;
            return sum;
        }
        int getDie1(){
            return die1;
        }
        int getDie2(){
            return die2;
        }
        int getRoundNr(){
            return roundNr;
        }

    }
 



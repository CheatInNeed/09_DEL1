import java.util.Random;

public class DiceCup extends TotalPoints{
    Random rand = new Random();

    int die1;
    int die2;
    int prevDie1;
    int prevDie2;
    int roundNr = 0;

        void rollDice (){
            this.prevDie2 = die2;
            this.prevDie1 = die1;
            this.die1 = rand.nextInt(1, 7);
            this.die2 = rand.nextInt(1, 7);
            setTotalPoints(getSum());
            roundNr++;
        }
        int getSum(){
            int sum = this.die1 + this.die2;
            return sum;
        }
        int getDie1(){
            return this.die1;
        }
        int getDie2(){
            return this.die2;
        }
        int getPrevDie1() {
            return this.prevDie1;
        }
        int getPrevDie2() {
            return this.prevDie2;
        }
        int getRoundNr(){
            return this.roundNr;
        }
        boolean getIsEns(){
            if (die1 == die2) {
                return true;
            }
            return false;
        }

        boolean getPrevIsEns(){
            if (prevDie1 == prevDie2) {
                return true;
            }
            return false;
        }

    }
 



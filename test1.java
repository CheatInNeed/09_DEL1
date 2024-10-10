public class test1 {
    /* Player test = new Player();Test
     * Frekvens af sum(2-12)
     * Frekvens af ens terninger
     */
    public static void main(String[] args) {
        Player test = new Player();
        int testRound = 1000;
        int numEqual = 0;
        int[] freqSum = new int[12-2+1];
        System.out.println(freqSum.length);
        for (int i = 0; i < testRound; i++) {
            test.rollDice();
            freqSum[test.getSum()-2]++;
            if (test.getIsEns()) {
                numEqual++;
            }
        }
        System.out.println("Number of equal dice hit: "+numEqual);
        System.out.println("Frequency of each sum");
        for (int i = 0; i < freqSum.length; i++) {
            System.out.println(i+2+": "+freqSum[i]);
        }
    }
}

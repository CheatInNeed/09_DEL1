public class test2 {
    public static void main(String[] args) {
        Player test = new Player();

        long start = System.nanoTime();
        test.rollDice();
        long finish = System.nanoTime();
        double timeElapsed = finish - start;
        System.out.println(timeElapsed/100000+" ms");
    }
}

public class TotalPoints {
    private int totalPoints = 0;

    public int getTotalPoints() {
        return this.totalPoints; 
    }

    public void dropPoints() {
        this.totalPoints = 0;
    }
}
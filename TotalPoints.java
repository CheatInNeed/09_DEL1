public class TotalPoints {
    private int totalPoints = 0;

    public void setTotalPoints(int totalPoints) {
        this.totalPoints += totalPoints;
    }

    public int getTotalPoints() {
        return this.totalPoints; 
    }

    public void dropPoints() {
        this.totalPoints = 0;
    }
}
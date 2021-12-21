public class Apple extends Entity {

    public static final int DEFAULT_POINTS = 1;
    private int points;

    public Apple(int points) { this.points = points; }
    public Apple() { this(DEFAULT_POINTS); }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

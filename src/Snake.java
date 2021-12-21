public class Snake extends Entity {

    public static final int DEFAULT_LENGTH = 3;
    private int length;
    private Direction direction;


    public Snake(int length) {
        this.length = length;
    }

    public Snake() {
        this(DEFAULT_LENGTH);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}

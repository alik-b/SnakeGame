public class Board {

    public static final int DEFAULT_WIDTH = 15;
    public static final int DEFAULT_HEIGHT = 15;
    private char[][] board;

    public Board(int width, int height) {
        board = new char[width][height];
        initializeBoard();
    }

    private void initializeBoard() {
    }

}

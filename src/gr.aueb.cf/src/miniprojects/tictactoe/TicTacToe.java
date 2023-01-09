package miniprojects.tictactoe;

import java.util.Scanner;

class TicTacToe {
    public static final int BOARD_DIMENSION = 3;
    private char[][] board;

    private Player playerX;
    private Player playerO;

    private Player currentPlayer;

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.printCurrentState();
        ticTacToe.nextMove();
        ticTacToe.printCurrentState();
    }


    public TicTacToe() {
        this.board = new char[BOARD_DIMENSION][BOARD_DIMENSION];
        this.playerX = new Player("X");
        this.playerO = new Player("O");
        this.currentPlayer = playerX;

    }

    char[][] getBoard() {
        return board;
    }

    Player getPlayerX() {
        return playerX;
    }

    Player getPlayerO() {
        return playerO;
    }

    void printCurrentState() {
        int index = 0;
        for (char[] row : this.board) {
            System.out.println("\n");
            for (char column : row) {
                System.out.print(this.board[row[index]][column]);
                System.out.print("\t");
            }
            index++;

        }
    }

    void nextMove() {
        currentPlayer = currentPlayer == playerX ? playerO : playerX;
        System.out.println(currentPlayer + " make your move");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

    }

    boolean validateMove(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String[] position = input.split(",");
        if (position.length != 2) {
            return false;
        }
        try {
            int moveX = Integer.parseInt(position[0].trim());
            int moveY = Integer.parseInt(position[1].trim());
            if (moveX >= BOARD_DIMENSION || moveY >= BOARD_DIMENSION) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


}

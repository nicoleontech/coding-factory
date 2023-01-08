package miniprojects.tictactoe;

class Player {

    private String signature;

    public Player(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Player with signature " + this.signature;
    }
}

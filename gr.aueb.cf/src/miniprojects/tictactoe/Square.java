package miniprojects.tictactoe;

class Square {

    private final Position position;
    private Player player;

    Square(Position position) {
        this.position = position;
    }

    void setPlayer(Player player) {
        this.player = player;
    }

    public Position getPosition() {
        return position;
    }


    boolean isEmpty() {
        return player == null;
    }

    @Override
    public boolean equals(Object obj) {
        if(player == null)
            return false;
        if(obj instanceof Player) {
            return this.player.equals(obj);
        }
        return false;
    }
}

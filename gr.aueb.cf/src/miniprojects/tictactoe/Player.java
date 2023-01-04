package miniprojects.tictactoe;

import java.util.Objects;

class Player {

    private final String type;

    public Player(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            return type.equals(obj);
        } else if (obj instanceof Player) {
            Player player = (Player) obj;
            return player.equals(type);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

     void play(Square square) {
       square.setPlayer(this);
    }
}

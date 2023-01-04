package miniprojects.tictactoe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SquareTest {

    @Test
    void square_isEmpty_returnsFalse_whenPlayerIsNotNull() {
        var sut = new Square(new Position(1, 1));
        sut.setPlayer(new Player("X"));
        assertThat(sut.isEmpty()).isFalse();
    }

    @Test
    void square_isEmpty_returnsTrue_whenPlayerIsNull() {
        var sut = new Square(new Position(1, 1));
        assertThat(sut.isEmpty()).isTrue();
    }

    @Test
    void square_onePlayer_canPlay_onlyOnce_inTheSameSquare(){
        var player = new Player("X");
        var samePlayer = new Player("X");
        var sut = new Square(new Position(1,1));
        player.play(sut);
        samePlayer.play(sut);
        sut.setPlayer(player);
        sut.setPlayer(samePlayer);
    }

}
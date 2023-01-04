package miniprojects.tictactoe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    @Test
    void player_isUnique() {
        var sut = new Player("X");
        var sut1 = new Player("X");
        assertThat(sut).isEqualTo(sut1);
    }

    @Test
    void player_onlyOnePlayer_canPlay_inTheSameSquare(){
        var sut = new Player("X");
        var sut1 = new Player("X");
        sut.play(new Square(new Position(1,1)));
        sut1.play(new Square(new Position(1,1)));

    }
}

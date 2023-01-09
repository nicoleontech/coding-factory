package miniprojects.tictactoe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicTacToeTest {

    TicTacToe sut = new TicTacToe();

    @Test
    void createsBoard_WithDimensionsThreeTimesThree() {
        assertThat(sut.getBoard()).isNotNull();
        assertThat(sut.getBoard().length).isEqualTo(3);
    }

    @Test
    void createsTwoPlayers() {
        assertThat(sut.getPlayerX()).isNotNull();
        assertThat(sut.getPlayerO()).isNotNull();

    }

    @Test
    void printCurrentState() {
        sut.printCurrentState();
    }

    @Test
    void nextMove_distinguishesPlayersTurn() {
        sut.nextMove();
    }

    @Test
    void validateMove_returnsFalse_whenInputIsEmpty() {
        var result = sut.validateMove("");
        assertThat(result).isFalse();
    }

    @Test
    void validateMove_returnsFalse_whenInputDoesNotContainComma() {
        var result = sut.validateMove("I am funny");
        assertThat(result).isFalse();
    }

    @Test
    void validateMove_returnsFalse_whenInputIsNotNumeric() {
        var result = sut.validateMove("I, am funny");
        assertThat(result).isFalse();
    }

    @Test
    void validateMove_returnsTrue_whenInputIsValid() {
        var result = sut.validateMove("  0    , 1");
        assertThat(result).isTrue();
    }
}

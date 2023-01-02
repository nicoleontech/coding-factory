package miniprojects;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SixPackTest {

    @Test
    void sixPack_acceptsArrayOfSixNumbers() {
        var sut = new SixPack(new int[]{6, 5, 4, 3, 2, 1});
        assertThat(sut.getEntries()).hasSize(6);
    }

    @Test
    void sixPack_DoesNotContainEmptyValues() {
        var sut = new SixPack(new int[]{1, 2, 3, 4, 5, 6});
        assertThat(sut.getEntries()[0]).isGreaterThan(0);
        assertThat(sut.getEntries()[1]).isGreaterThan(0);
        assertThat(sut.getEntries()[2]).isGreaterThan(0);
        assertThat(sut.getEntries()[3]).isGreaterThan(0);
        assertThat(sut.getEntries()[4]).isGreaterThan(0);
        assertThat(sut.getEntries()[5]).isGreaterThan(0);
    }

    @Test
    void sixPack_ThrowsIAE_whenInputArrayDoesNotContainSixNumbers() {
        assertThatThrownBy(() -> new SixPack(new int[]{}))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void sixPack_ContainsAtMost4EvenNumbers_returnsTrue_whenNumberOfEvensLessThanFour() {
        var sut = new SixPack(new int[]{1, 2, 3, 4, 5, 6});
        assertThat(sut.containsAtMostFourEvenNumbers()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMost4EvenNumbers_returnsFalse_whenNumberOfEvensMoreThanFour() {
        var sut = new SixPack(new int[]{1, 2, 2, 4, 4, 6});
        assertThat(sut.containsAtMostFourEvenNumbers()).isFalse();
    }

    @Test
    void sixPack_ContainsAtMost4OddNumbers_returnsTrue_whenNumberOfOddsLessThanFour() {
        var sut = new SixPack(new int[]{1, 1, 3, 4, 5, 6});
        assertThat(sut.containsAtMostFourOddNumbers()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMost4OddNumbers_returnsFalse_whenNumberOfOddsMoreThanFour() {
        var sut = new SixPack(new int[]{1, 1, 3, 3, 5, 6});
        assertThat(sut.containsAtMostFourOddNumbers()).isFalse();
    }

    @Test
    void sixPack_ContainsAtMostThreeSameNumbersInTheEnd_returnsTrue() {
        var sut = new SixPack(new int[]{1, 2, 3, 4, 4, 4});
        assertThat(sut.containsAtMostThreeSameNumbersInTheEnd()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMostThreeSameNumbersInTheEnd_returnsFalse() {
        var sut = new SixPack(new int[]{1, 2, 4, 4, 4, 4});
        assertThat(sut.containsAtMostThreeSameNumbersInTheEnd()).isFalse();
    }

    @Test
 void sixPack_ContainsAtMostThreeNumbersInSameTen_returnsTrue(){
     var sut = new SixPack(new int[]{1, 2, 12, 14, 15, 20});
     assertThat(sut.containsAtMostThreeNumbersInSameTen()).isTrue();
    }

    @Test
    void sixPack_ContainsAtMostThreeNumbersInSameTen_returnsFalse(){
        var sut = new SixPack(new int[]{1, 10, 12, 14, 15, 20});
        assertThat(sut.containsAtMostThreeNumbersInSameTen()).isFalse();
    }


}
package miniprojects;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationsSixTest {

    CombinationsSix subjectUnderTest = new CombinationsSix();

    @Test
    void makeCombinations_returnsEveryPossibleCombination() throws CsvValidationException, IOException {
        var result = subjectUnderTest.makeCombinations();
        assertThat(result).isNotEmpty();
    }
}
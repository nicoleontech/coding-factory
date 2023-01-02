package test.testing.miniprojects;

import com.opencsv.exceptions.CsvValidationException;
import miniprojects.CombinationsSix;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationsSixTest {

    CombinationsSix subjectUnderTest = new CombinationsSix();

    @Test
    void getFirstNumber_FromImportedEntries() throws CsvValidationException, IOException {
        var result = subjectUnderTest.makeCombinations();
        assertThat(result).isNotNull();
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[5]).isEqualTo(6);
    }
}
package miniprojects.combinationsofsix;


import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationsSixImporterTest {

    CombinationsSixImporter subjectUnderTest = new CombinationsSixImporter();

    public CombinationsSixImporterTest() throws IOException, CsvValidationException {
    }

    @Test
    void importedEntriesFromFile_notNull() {
        var result = subjectUnderTest.getImportedNumbers();
        assertThat(result).isNotNull();
    }

    @Test
    void importedEntriesFromFile_Sorted() {
        var result = subjectUnderTest.getImportedNumbers();
        assertThat(result).isSorted();
    }

    @Test
    void importedEntries_NotGreaterThan49() {
        var result = subjectUnderTest.getImportedNumbers();
        assertThat(result.length).isEqualTo(48);
    }
}
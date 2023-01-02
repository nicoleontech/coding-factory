package miniprojects;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CombinationsSixImporter {

    private int[] importedNumbers;

    public CombinationsSixImporter() throws IOException, CsvValidationException {
        int[] nums = new int[48];
        try (CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\NS\\numbers.csv"))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
               int count=0;
                for (String value : values) {
                    nums[count] = Integer.parseInt(value);
                    Arrays.sort(nums);
                    this.importedNumbers = nums;
                }
            }
        }
    }

    public int[] getImportedNumbers() {
        return importedNumbers;
    }

}



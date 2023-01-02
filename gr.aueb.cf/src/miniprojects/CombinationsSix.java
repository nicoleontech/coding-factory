package miniprojects;


import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.List;

public class CombinationsSix {

//    private final int THRESHOLD = 4;
//    private final int n = 4;
    private static CombinationsSixImporter importer;
    public static void main(String[] args) {

    }

    public static List<Integer> makeCombinations() throws CsvValidationException, IOException {
        importer = new CombinationsSixImporter();
        return importer.getImportedNumbers();
    }


}

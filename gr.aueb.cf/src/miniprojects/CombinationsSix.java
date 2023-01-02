package miniprojects;


import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.List;

public class CombinationsSix {

    //    private final int THRESHOLD = 4;
    private static final int n = 6;
    private static CombinationsSixImporter importer;
    private static int[] combinations;

    public static void main(String[] args) {

    }

    public static int[] makeCombinations() throws CsvValidationException, IOException {
        importer = new CombinationsSixImporter();
        List<Integer> importedNumbers = importer.getImportedNumbers();
        combinations = new int[6];
        for (int i = 0; i < importedNumbers.size() - n; i++) {
            for (int j = i + 1; j < importedNumbers.size() - n + 1; j++) {
                for (int k = j + 1; k < importedNumbers.size() - n + 2; k++) {
                    for (int l = k + 1; l < importedNumbers.size() - n + 3; l++) {
                        for (int m = l + 1; m < importedNumbers.size() - n + 4; m++) {
                            for (int n = m + 1; n < importedNumbers.size(); n++) {
                                combinations[0]= 1;
                                combinations[1]= 2;
                                combinations[2]= 3;
                                combinations[3]= 4;
                                combinations[4]= 5;
                                combinations[5]= 6;
                            }
                        }
                    }
                }
            }
        }
        return combinations;
    }


}

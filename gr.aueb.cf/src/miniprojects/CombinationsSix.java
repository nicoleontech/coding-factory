package miniprojects;


import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsSix {

    //    private final int THRESHOLD = 4;
    private static final int n = 6;
    private static CombinationsSixImporter importer;


    public static void main(String[] args) {

    }

    public static List<SixPack> makeCombinations() throws CsvValidationException, IOException {
       var result = new ArrayList<SixPack>();
        importer = new CombinationsSixImporter();
        int[] importedNumbers = importer.getImportedNumbers();
        int chunk = 6;
        for(int i = 0; i< importedNumbers.length; i+=chunk){
            try{
                var chunkEntry = Arrays.copyOfRange(importedNumbers,i,i+chunk);
              var sixPackEntry= new SixPack(chunkEntry);
               result.add(sixPackEntry);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                // continue;
            }

        }

        return result;
    }


}

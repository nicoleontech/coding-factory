package miniprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SixPack {

    static final int MAX_LIMIT_OF_EVEN_NUMBERS = 4;
    static final int MAX_LIMIT_OF_ODD_NUMBERS = 4;
    static final int MAX_LENGTH = 6;
    public static final int MAX_LIMIT_OF_SAME_ENDING_NUMBERS = 3;
    private int[] entries;

    SixPack(int[] entries) {
        if (entries == null || entries.length != MAX_LENGTH) {
            throw new IllegalArgumentException("Entry must contain 6 numbers");
        }
        this.entries = entries;
    }

    int[] getEntries() {
        return entries;
    }

    boolean containsAtMostFourEvenNumbers() {
        var count = 0;
        for (int entry : entries) {
            if (entry % 2 == 0) {
                count++;
            }
        }
        return count <= MAX_LIMIT_OF_EVEN_NUMBERS;
    }

    boolean containsAtMostFourOddNumbers() {
        var count = 0;
        for (int entry : entries) {
            if (entry % 2 == 1) {
                count++;
            }
        }
        return count <= MAX_LIMIT_OF_ODD_NUMBERS;
    }

    boolean containsAtMostThreeSameNumbersInTheEnd() {
        var count = 1;
        for (int i = entries.length - 1; i > 2; i--) {
            if (entries[i] == entries[i - 1]) {
                count++;
            }

        }

        return count <= MAX_LIMIT_OF_SAME_ENDING_NUMBERS;
    }

    boolean containsAtMostThreeNumbersInSameTen() {
        var count = 0;
        List<Integer> tens = new ArrayList<>();
        for (int entry : entries) {
            int ten = entry / 10;
            tens.add(ten);
        }
        var result = tens.stream().collect(Collectors.groupingBy(ten -> ten));
        for (List<Integer> value : result.values()) {
            if (value.size() > 3) {
                return false;
            }
        }
        return true;
    }
}

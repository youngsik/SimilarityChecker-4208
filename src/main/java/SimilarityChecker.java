import java.util.ArrayList;
import java.util.List;

public class SimilarityChecker {

    private static final int maxScore = 60;

    public int guessStrCountMark(String input1, String input2) {

        if (input1.length() == input2.length()) return maxScore;
        if (input1.length() >= input2.length() * 2|| input2.length() >= input1.length() * 2) return 0;

        return getMark(Math.max(input1.length(), input2.length()), Math.min(input1.length(), input2.length()));
    }

    private static int getMark(int longLength, int shortLength) {
        double gab = longLength - shortLength;
        double gabDivideShort = gab / (double) shortLength;
        int mark = (int) ((1 - gabDivideShort) * maxScore);
        return mark;
    }



    public List<String> findDuplicateRemoveList(String input1) {

        List<String> result = new ArrayList<>();
        for (int i = 0; i < input1.length(); i++) {
            String ch = String.valueOf(input1.charAt(i));
            if (!result.contains(ch)) {
                result.add(ch);
            }
        }

        return result;
    }
}

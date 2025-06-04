public class SimilarityChecker {

    public int guessStrCountMark(String input1, String input2) {

        if (input1.length() == input2.length()) return 60;

        int longLength = input1.length();
        int shortLength = input2.length();

        if(input2.length() > input1.length())
        {
            longLength = input2.length();
            shortLength = input1.length();
        }

        return getMark(longLength, shortLength);
    }

    private static int getMark(int longLength, int shortLength) {
        double gab = (double)(longLength - shortLength);
        double gabDivideShort = gab / (double) shortLength;
        int mark = (int) ((1- gabDivideShort) * 60);
        return mark;
    }
}

public class SimilarityChecker {
    public int getLength(String input) {

        return input.length();
    }


    public int guessStrCountMark(String input1, String input2) {

        if (input1.length() == input2.length())
        {
            return 60;
        }
        return 0;
    }
}

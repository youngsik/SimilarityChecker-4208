import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    @Test
    void CountSameStringLength() {

        SimilarityChecker similarityChecker = new SimilarityChecker();
        String input1 = "ABCD";
        String input2 = "EFGH";
        int expected = 60;
        int output =similarityChecker.guessStrCountMark(input1,input2);

        assertEquals(output, expected);
    }

    @Test
    void CountDifferenceStringLength() {

        SimilarityChecker similarityChecker = new SimilarityChecker();
        String input1 = "ABCD";
        String input2 = "EFGHIJ";
        int expected = 30;
        int output =similarityChecker.guessStrCountMark(input1,input2);

        assertEquals(output, expected);
    }

    @Test
    void CountDifferenceStringLength2() {

        SimilarityChecker similarityChecker = new SimilarityChecker();
        String input1 = "ABCDEQW";
        String input2 = "EFG";
        int expected = -19;
        int output =similarityChecker.guessStrCountMark(input1,input2);

        assertEquals(output, expected);
    }

}
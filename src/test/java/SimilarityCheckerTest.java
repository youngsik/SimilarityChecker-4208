import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
    void CountOverDoubleStringLength() {

        SimilarityChecker similarityChecker = new SimilarityChecker();
        String input1 = "AB";
        String input2 = "EFGHER";
        int expected = 0;
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
        String input1 = "ABCDE";
        String input2 = "EFG";
        int expected = 20;
        int output =similarityChecker.guessStrCountMark(input1,input2);

        assertEquals(output, expected);
    }


    @Test
    void RemoveDuplicateChar() {

        SimilarityChecker similarityChecker = new SimilarityChecker();
        String input1 = "CDDDAB";
        List<String> expected =new ArrayList<String>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        expected.add("D");
        //int output =similarityChecker.guessStrAlphabetMark(input1,input2);

        List<String> output =similarityChecker.findDuplicateRemoveList(input1);
        assertTrue(new HashSet<>(output).equals(new HashSet<>(expected)));
    }




}
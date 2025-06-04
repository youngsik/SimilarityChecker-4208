public class SimilarityChecker {
    public int getLength(String input) {

        return input.length();
    }


    public int guessStrCountMark(String input1, String input2) {

        int longLength;
        int shortLength;
        int mark;
        if (input1.length() == input2.length())
        {
            mark =  60;
        }
        else
        {
            longLength = input1.length();
            shortLength = input2.length();

            if(input2.length() > input1.length())
            {
                longLength = input2.length();
                shortLength = input1.length();
            }

            double gab = (double)(longLength-shortLength);

            double gabDivideShort = gab / (double) shortLength;

            mark = (int) ((1- gabDivideShort) * 60);


        }

        return mark;
    }
}

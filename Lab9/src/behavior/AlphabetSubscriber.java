package behavior;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Flow;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphabetSubscriber extends StringSubscriber{
    public AlphabetSubscriber() {
        super("Alphabet.txt");
    }

    @Override
    public boolean check(String item) {
        Pattern letter = Pattern.compile("[a-zA-z]",Pattern.CASE_INSENSITIVE);
        Matcher hasLetter = letter.matcher(item);
        return hasLetter.find();
    }

}

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
    public void onNext(String item) {

            try {
                Writer file = new FileWriter("Alphabet.txt",true);
                file.write(item+"\n");
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    @Override
    public boolean check(String item) {
        Pattern letter = Pattern.compile("[a-zA-z]",Pattern.CASE_INSENSITIVE);
        Matcher hasLetter = letter.matcher(item);
        return hasLetter.find();
    }

}

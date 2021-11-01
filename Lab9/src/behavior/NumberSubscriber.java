package behavior;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Flow;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberSubscriber extends StringSubscriber{
    public NumberSubscriber() {
        super("Number.txt");
    }

    @Override
    public boolean check(String item) {
        Pattern digit = Pattern.compile("[0-9]");
        Matcher hasDigit = digit.matcher(item);
        return hasDigit.find();
    }
}

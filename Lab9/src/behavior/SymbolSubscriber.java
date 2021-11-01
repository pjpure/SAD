package behavior;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Flow;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolSubscriber extends StringSubscriber {
    public SymbolSubscriber() {
        super("Symbol.txt");
    }

    @Override
    public void onNext(String item) {

            try {
                Writer file = new FileWriter("Symbol.txt",true);
                file.write(item+"\n");
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    @Override
    public boolean check(String item) {
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}/\\[\\]~-]");
        Matcher hasSpecial = special.matcher(item);
        return hasSpecial.find();
    }
}

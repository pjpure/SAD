package behavior;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.Flow.Subscriber;

public abstract class StringSubscriber implements Subscriber<String> {

    private Subscription subscription;
    private String filename;

    public StringSubscriber(String name){
        try{
            filename = name;
            File file = new File(name);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public void onNext(String item) {
        try {
            Writer file = new FileWriter(filename,true);
            file.write(item+"\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Subscriber Error: "+throwable.toString());
    }

    @Override
    public void onComplete() {
        System.out.println("Complete");
    }

    abstract public boolean check(String item);
}

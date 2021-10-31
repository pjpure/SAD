package behavior;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.Flow.Subscriber;

public abstract class StringSubscriber implements Subscriber<String> {

    private Subscription subscription;

    public StringSubscriber(String name){
        try{
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

    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Subscriber Error: "+throwable.toString());
    }

    @Override
    public void onComplete() {
        System.out.println("Complete");
    }


}

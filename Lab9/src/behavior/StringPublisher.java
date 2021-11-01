package behavior;
import java.util.ArrayList;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class StringPublisher implements Publisher<String> {
    private ArrayList<StringSubscription> subscriptions = new ArrayList<>();
    @Override
    public void subscribe(Subscriber subscriber) {
        StringSubscription subscription = new StringSubscription(subscriber);
        subscriber.onSubscribe(subscription);
        subscriptions.add(subscription);
    }

    public void publish(String s){
        for(StringSubscription subscription : subscriptions){
            if(subscription.check(s)){
                subscription.publish(s);
            }
        }
    }
}

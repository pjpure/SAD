package behavior;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.Flow.Subscriber;
public class StringSubscription implements Subscription {
    private Subscriber subscriber;
    StringSubscription(Subscriber subscriber){
        this.subscriber = subscriber;
    }
    @Override
    public void request(long n) {

    }

    @Override
    public void cancel() {

    }

    public void publish(String s) {
        subscriber.onNext(s);
    }
}

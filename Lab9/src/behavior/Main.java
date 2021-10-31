package behavior;

import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class Main {

    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();
        Subscriber subscriber1 = new AlphabetSubscriber();
        Subscriber subscriber2 = new NumberSubscriber();
        Subscriber subscriber3 = new SymbolSubscriber();
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        Scanner scanner = new Scanner(System.in);
        String inp = "";
        while(true){
            System.out.print("Enter text:");
            inp = scanner.nextLine();
            if(inp.equals("exit")){
                break;
            }
            publisher.publish(inp);
        }
        scanner.close();

    }
}

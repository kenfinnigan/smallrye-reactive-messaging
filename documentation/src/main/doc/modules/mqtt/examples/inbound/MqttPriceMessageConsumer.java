package inbound;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.CompletionStage;

@ApplicationScoped
public class MqttPriceMessageConsumer {

    @Incoming("prices")
    public CompletionStage<Void> consume(Message<byte[]> price) {
        // process your price.

        // Acknowledge the incoming message
        return price.ack();
    }

}

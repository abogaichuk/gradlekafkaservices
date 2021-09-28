package app;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationHandler {

    @KafkaListener(topics = "notifications", groupId = "notification_group_id")
    public void consume(Notification notification){
        System.out.println("Consuming notification: " + notification);
    }
}

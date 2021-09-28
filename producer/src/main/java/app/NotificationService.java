package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private KafkaTemplate<String, Notification> kafkaTemplate;

    public void produce(Notification notification) {
        System.out.println("send notification: " + notification);
        kafkaTemplate.send("notifications", notification);
    }
}

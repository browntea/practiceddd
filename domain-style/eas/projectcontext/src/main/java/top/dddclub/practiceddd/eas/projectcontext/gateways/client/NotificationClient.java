package xyz.zhangyipracticeddd.eas.projectcontext.gateways.client;

import org.springframework.stereotype.Service;
import xyz.zhangyipracticeddd.eas.notificationcontext.application.NotificationAppService;
import xyz.zhangyipracticeddd.eas.notificationcontext.domain.Message;
import xyz.zhangyipracticeddd.eas.projectcontext.interfaces.notification.NotificationService;

@Service
public class NotificationClient implements NotificationService {
    private NotificationAppService notification = new NotificationAppService();

    @Override
    public void send(String destination, String content) {
        notification.send(() -> destination, new Message(content));
    }
}
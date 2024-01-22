package pl.majczyna.notification;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    public void send(NotificationRequest notificationRequest){
        notificationRepository.save(Notification.builder().notificationName(notificationRequest.name()).build());
    }
}

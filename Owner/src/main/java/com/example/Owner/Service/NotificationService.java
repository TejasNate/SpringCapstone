/**package com.example.Owner.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Owner.Model.Notification;
import com.example.Owner.Repo.NotificationRepository;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}**/
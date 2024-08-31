/**package com.example.userplay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.userplay.model.Notification;
import com.example.userplay.repo.NotificationRepository;


@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    // Fetch all notifications
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    // Fetch a notification by ID
    public Optional<Notification> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }

    // Create or update a notification
    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    // Delete a notification by ID
    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}**/

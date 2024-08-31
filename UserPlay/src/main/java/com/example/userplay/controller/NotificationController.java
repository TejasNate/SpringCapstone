/**package com.example.userplay.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userplay.model.Notification;
import com.example.userplay.service.NotificationService;



@RestController
@RequestMapping("users/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public Optional<Notification> getNotificationById(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }

    @PostMapping
    public Notification saveNotification(@RequestBody Notification notification) {
        return notificationService.saveNotification(notification);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
    }
}**/

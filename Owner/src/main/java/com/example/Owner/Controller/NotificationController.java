/**package com.example.Owner.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Owner.Model.Notification;
import com.example.Owner.Service.NotificationService;

@RestController
@RequestMapping("owners/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.saveNotification(notification);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> getNotificationById(@PathVariable Long id) {
        Notification notification = notificationService.getNotificationById(id);
        return notification != null ? ResponseEntity.ok(notification) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
        return ResponseEntity.noContent().build();
    }
}**/


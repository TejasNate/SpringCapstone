package com.example.Owner.Controller;

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

import com.example.Owner.Model.Application;
import com.example.Owner.Service.ApplicationService;

@RestController
@RequestMapping("owners/applications")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @PostMapping
    public Application createApplication(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Application> getApplicationById(@PathVariable Long id) {
        Application application = applicationService.getApplicationById(id);
        return application != null ? ResponseEntity.ok(application) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return ResponseEntity.ok("Application has been deleted successfully.");
    }
    @PostMapping("/{id}/increment-download")
    public ResponseEntity<Application> incrementDownloadCount(@PathVariable Long id) {
        Application updatedApplication = applicationService.incrementDownloadCount(id);
        if (updatedApplication != null) {
            return ResponseEntity.ok(updatedApplication);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


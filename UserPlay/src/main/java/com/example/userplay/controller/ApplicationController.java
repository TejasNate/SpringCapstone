package com.example.userplay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.userplay.model.Application;
import com.example.userplay.service.ApplicationService;




@RestController
@RequestMapping("/users/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    // Add a new application (only for owners)
//    @PostMapping("/add")
//    public ResponseEntity<Application> addApplication(@RequestBody Application application) {
//        Application createdApplication = applicationService.addApplication(application);
//        return new ResponseEntity<>(createdApplication, HttpStatus.CREATED);
//    }

    // Get details of an application by name
    @GetMapping("/{name}")
    public ResponseEntity<Application> getApplicationByName(@PathVariable String name) {
        Application application = applicationService.findByName(name);
        if (application != null) {
            return new ResponseEntity<>(application, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    // Update an existing application
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Application> updateApplication(@PathVariable Long id, @RequestBody Application applicationDetails) {
//        Application updatedApplication = applicationService.updateApplication(id, applicationDetails);
//        if (updatedApplication != null) {
//            return new ResponseEntity<>(updatedApplication, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // Delete an application
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteApplication(@PathVariable Long id) {
//        boolean isDeleted = applicationService.deleteApplication(id);
//        if (isDeleted) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // Get all applications
//    @GetMapping("/all")
//    public ResponseEntity<List<Application>> getAllApplications() {
//        List<Application> applications = applicationService.getAllApplications();
//        return new ResponseEntity<>(applications, HttpStatus.OK);
//    }

    // Additional endpoints for filtering by genre, ratings, etc., can be added here
}

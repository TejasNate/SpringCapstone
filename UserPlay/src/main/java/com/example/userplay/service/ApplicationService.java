package com.example.userplay.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userplay.model.Application;
import com.example.userplay.repo.ApplicationRepository;

import java.util.List;



@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

   

    public Application addApplication(Application application) {
        return applicationRepository.save(application);
    }

    public Application findByName(String name) {
        return applicationRepository.findByName(name);
    }

    public Application updateApplication(Long id, Application applicationDetails) {
        return applicationRepository.findById(id).map(application -> {
            application.setName(applicationDetails.getName());
            application.setDescription(applicationDetails.getDescription());
            application.setReleaseDate(applicationDetails.getReleaseDate());
            application.setVersion(applicationDetails.getVersion());
            application.setRatings(applicationDetails.getRatings());
          
            return applicationRepository.save(application);
        }).orElse(null);
    }

    public boolean deleteApplication(Long id) {
        return applicationRepository.findById(id).map(application -> {
            applicationRepository.delete(application);
            return true;
        }).orElse(false);
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
}
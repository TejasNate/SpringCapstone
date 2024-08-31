package com.example.Owner.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Owner.Model.Application;
import com.example.Owner.Repo.ApplicationRepository;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
    public Application incrementDownloadCount(Long appId) {
        Application application = getApplicationById(appId);
        if (application != null) {
            application.setDownloadCount(application.getDownloadCount() + 1);
            applicationRepository.save(application);
        }
        return application;
    }
}
package com.example.Owner.Model;






import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="owners")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    @Column(name = "owner_id")
    private Long id;
    
    private String name;
    private String address;
    private String phoneNumber;

    
    @OneToMany
    @JoinColumn(name="app_id")
    private Set<Application> applications = new HashSet<>();
    
    
    
    

	public Set<Application> getApplications() {
		return applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

	// Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


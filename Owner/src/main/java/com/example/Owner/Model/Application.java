package com.example.Owner.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String name;

    
    private String description;

    
    private Date releaseDate;

    
    private String version;

   
    private float ratings;

    
    
    //private int DownloadCount;
    
    //@ManyToOne
   // @JoinColumn(name = "owner_id")
    //private Owner owner;

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

   public String getDescription() {
   	return description;
   }

   public void setDescription(String description) {
   	this.description = description;
   }

   public Date getReleaseDate() {
   	return releaseDate;
   }

   public void setReleaseDate(Date releaseDate) {
   	this.releaseDate = releaseDate;
   }

   public String getVersion() {
   	return version;
   }

   public void setVersion(String version) {
   	this.version = version;
   }

   public float getRatings() {
   	return ratings;
   }

   public void setRatings(float ratings) {
   	this.ratings = ratings;
   }

 

//   public Owner getOwner() {
//   	return owner;
//   }
//
//   public void setOwner(Owner owner) {
//   	this.owner = owner;
//   }

public int getDownloadCount() {
	// TODO Auto-generated method stub
	return 0;
}

public void setDownloadCount(int i) {
	// TODO Auto-generated method stub
	
}
}


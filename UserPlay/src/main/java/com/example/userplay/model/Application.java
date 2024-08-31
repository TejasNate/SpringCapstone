package com.example.userplay.model;




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
    private String releaseDate;
    private String version;
    private float ratings;


   @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
   private User owner;

    //@ManyToOne
    //@JoinColumn(name = "owner_id")
    //private Owner owner;
    
//  @ManyToOne
//   @JoinColumn(name = "category_id")
//    private Category category; 
   
   

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
//	public Category getCategory() {
//        return category; // Getter for Category
//    }
//
//    public void setCategory(Category category) {
//        this.category = category; // Setter for Category
//    }
	

	//public Owner getOwner() {
//		return owner;
//	}
//
//	public void setOwner(Owner owner) {
//		this.owner = owner;
//	}

	

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
    // Getters and Setters
  
}

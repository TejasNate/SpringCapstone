package com.example.userplay.dto;



//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;

public class UserRegistrationRequest {
	private Long userId;

    //@NotEmpty(message = "Username cannot be empty")
    //@Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;

    //@NotEmpty(message = "Password cannot be empty")
    //@Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    
    private String email;
    // Constructors
    public UserRegistrationRequest() {}

    public UserRegistrationRequest(Long userId, String username, String password, String email) {
        this.userId= userId;
    	this.username = username;
        this.password = password;
        this.email= email;
    }

    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
	public String toString() {
		return "UserRegistrationRequest [userId=" + userId + ", username=" + username + ", password=" + password
				+ ", email=" + email + "]";
	}
}

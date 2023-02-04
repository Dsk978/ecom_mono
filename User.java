package com.example.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class User {



   /** The id. */
    @Id
    @Column(unique = true, nullable = false)
    private int userid;



   /** The email. */
    @Column(unique = true, nullable = false)
    private String email;



   /** The password. */
    @Column(nullable = false)
    private String password;



   /** The is admin. */
    private boolean isAdmin;



   /**
     * Empty Constructor. Instantiates a new user.
     */
    public User() {
    }



   /**
     * Instantiates a new user.
     *
     * @param username the username
     * @param email    the email
     * @param password the password
     * @param isAdmin  the is admin
     */
    public User(int userid, String email, String password, boolean isAdmin) {
        this.userid = userid;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }



   /**
     * Gets the username.
     *
     * @return the username
     */
    



   /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }



   public int getUserid() {
	return userid;
}



public void setUserid(int userid) {
	this.userid = userid;
}



/**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }



   /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }



   /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Checks if is admin.
     *
     * @return true, if is admin
     */
    public boolean isAdmin() {
        return isAdmin;
    }
    
    /**
     * Sets the admin.
     *
     * @param isAdmin the new admin
     */
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
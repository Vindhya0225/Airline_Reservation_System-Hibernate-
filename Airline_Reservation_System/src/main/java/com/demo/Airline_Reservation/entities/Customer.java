package com.demo.Airline_Reservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
    @Column(name = "CustomerId", length = 10)
    private int customerId;
    
    @Column(name = "FirstName", length = 50)
    private String firstName;
    
    @Column(name = "LastName", length = 25)
    private String lastName;
    
    @Column(name = "PassPortNumber")
    private String passportNumber;
    
    @Column(name = "Address", length = 100)
    private String address;
    
    @Column(name = "Email", length = 30)
    private String email;
    
    @Column(name = "Phone", length = 11)
    private String phone;
    
    @OneToOne
    @JoinColumn(name = "BookingID")
    private Booking booking;

    // Default constructor
    public Customer() {
        super();
    }

    // Constructor for all fields
    public Customer(int customerId, String firstName, String lastName, String passportNumber, 
                    String address, String email, String phone) {
        this.customerId = customerId; // Fixed here
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.address = address;
        this.email = email;
        this.phone = phone; // Fixed here
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // toString
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName +
               ", passportNumber=" + passportNumber + ", address=" + address + ", email=" + email + ", phone=" + phone + "]";
    }
}

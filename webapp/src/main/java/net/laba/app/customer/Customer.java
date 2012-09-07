/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.laba.app.customer;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Rafael
 */
@Entity
public class Customer {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

//    @Embedded
//    private Address address;


    @ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name="add_tbl")
   
    private Map<Integer,Address> address = new <Integer,Address> HashMap();

    public Map getAddress() {
        return address;
    }

    public void setAddress(Map address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Transient
    private Integer age;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Customer(){
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
}

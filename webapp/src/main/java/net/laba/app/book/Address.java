/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;

/**
 *
 * @author admin
 */
@Entity
@SecondaryTables({
@SecondaryTable(name = "city"),
@SecondaryTable(name = "country")
})

public class Address {

    @Id @GeneratedValue
    private Long id;

    private String street1;
    private String street2;

    @Column(table = "city")
    private String city;
    @Column(table = "city")
    private String state;
    @Column(table="city")
    private String zipcode;
    @Column(table="country")
    private String country;

    public Address() {
    }


    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
}

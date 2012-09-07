/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.customer;

import javax.persistence.Embeddable;

/**
 *
 * @author admin
 */
@Embeddable
public class Address {

    private String street;
    private String country;

    public String getCountry() {
        return country;
    }

    public Address() {
    }

    
    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


}

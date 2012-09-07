/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author admin
 */

public class Country {

    @Id @GeneratedValue
    private Long id;
    private String country;

    public Country() {
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

}

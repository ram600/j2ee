/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.customer;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name="trol")
public class Order {


    @Id @GeneratedValue
    private Long id;
    private String name;

    @ElementCollection(fetch=FetchType.LAZY)
    @CollectionTable(name="order_embded")
    @Column(name="vasy")
    private Map <Integer,Address> address = new <Integer,Address>HashMap();

    public Order() {
    }



    

    public Map<Integer, Address> getAddress() {
        return address;
    }


    public void setAddress(Map<Integer, Address> address) {
        this.address = address;
    }

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

}

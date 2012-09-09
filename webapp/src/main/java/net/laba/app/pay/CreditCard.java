/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.pay;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author admin
 */
@Entity
public class CreditCard {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String number;
    private String expiryDate;
    private Integer controllerNumber;

    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;

    public Integer getControllerNumber() {
        return controllerNumber;
    }

    public void setControllerNumber(Integer controllerNumber) {
        this.controllerNumber = controllerNumber;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CreditCard(){
    }

}

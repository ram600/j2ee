/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.laba.app.customer;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Rafael
 */

public class CustomerHelper {
    private Integer ageCalcResult;
    private Customer customer;
    
    
    public void calculateAge(){
        Date dateOfBirth = customer.getDateOfBirth();
        Calendar birth = new GregorianCalendar();
        birth.setTime(dateOfBirth);
        Calendar now = new GregorianCalendar(2012,8,15);
        ageCalcResult = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        
    }   
    
    //Not implemented yet
    public Date getNextBirthDay(){
     return null;
    }
    
    public void clear(){
    ageCalcResult = 0;
    customer = null;
    }

    public Integer getAgeCalcResult() {
        return ageCalcResult;
    }

   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
}

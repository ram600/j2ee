/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.laba.app;

import java.util.Calendar;
import java.util.GregorianCalendar;
import net.laba.app.customer.Customer;
import net.laba.app.customer.CustomerHelper;

/**
 *
 * @author Rafael
 */
public class Run {
    
    
    public static void main(String[] args){
        
        Customer cust = new Customer("Vasya", "Ivanov");
        cust.setDateOfBirth(new GregorianCalendar(1989,6,14).getTime());
        CustomerHelper custhlp = new CustomerHelper();
        custhlp.setCustomer(cust);
        custhlp.calculateAge();
        System.out.println(custhlp.getAgeCalcResult());
    
    }
}

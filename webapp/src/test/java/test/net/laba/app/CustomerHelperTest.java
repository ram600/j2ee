/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.net.laba.app;

import java.util.Calendar;
import java.util.GregorianCalendar;
import junit.framework.*;
import net.laba.app.customer.Customer;
import net.laba.app.customer.CustomerHelper;
/**
 *
 * @author Rafael
 */
public class CustomerHelperTest extends TestCase {
    
    public static CustomerHelper custhlp = new CustomerHelper();
    
    public void setUp(){
        custhlp.clear();
        
    
    }
    
    public void testCalculateAge(){
        Customer cust = new Customer("Vasya", "Ivanov");
        cust.setDateOfBirth(new GregorianCalendar(1975,5,27).getTime());
        custhlp.setCustomer(cust);
        custhlp.calculateAge();
        
        int caIcAge = custhlp.getAgeCalcResult();
        
        assertTrue(caIcAge >= 0);
    }
    
    
    public void testExpectValue(){
        int age = 33;
        
        Calendar birdth = new GregorianCalendar();
        birdth.roll(Calendar.YEAR,age*(-1));
        birdth.roll(Calendar.DAY_OF_YEAR,-1);
        Customer cust = new Customer("Vasya", "Ivanov");
        cust.setDateOfBirth(birdth.getTime());
        custhlp.setCustomer(cust);
        custhlp.calculateAge();
        
        assertTrue(custhlp.getAgeCalcResult() == age);
    
    }
    
    
    public void tearDown(){
            custhlp.clear();
    }
}

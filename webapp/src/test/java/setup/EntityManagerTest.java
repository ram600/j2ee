/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package setup;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import junit.framework.TestCase;

/**
 *
 * @author admin
 */
public class EntityManagerTest extends TestCase {

    protected static EntityManagerFactory emf;
    protected static EntityManager em;
    protected static EntityTransaction tx;


    protected void setUp(){
        emf = Persistence.createEntityManagerFactory("books");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }

    protected void tearDown(){
        em.close();
        emf.close();
    }

    public void testEntityManager(){
        
        assertNotNull(em);
    }

}

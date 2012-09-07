/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.buisness;

import net.laba.app.book.Book;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless

public class BookEJB implements BookEJBRemote {


    @PersistenceContext(unitName="books")
    private EntityManager em;

    @Override
    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }

    @Override
    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }

   

  


}

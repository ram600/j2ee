/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.logic;

import com.mycompany.app.entities.Book;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless
@LocalBean
public class BookEJB {

    @PersistenceContext(unitName = "mk-library")
    private EntityManager em;

    public Book create(Book book) {
        em.persist(book);
        return book;
    }

    public Book update(Book book) {
        // Any changes with entity will be updated in database automatically
        return book;
    }

    public void delete(Book book) {
        em.remove(book);
    }

    public void delete(Long id) {
        Book book = em.find(Book.class, id);
        em.remove(book);
    }

    public List<Book> getList() {
        List<Book> books = em.createQuery("SELECT book FROM Book book", Book.class).getResultList();
        return books;
    }
    public Book read(Long id){
        return em.find(Book.class, id);
    }
}

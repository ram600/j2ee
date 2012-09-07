/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.app.logic;

import com.mycompany.app.entities.Author;
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
public class AuthorEJB {


    @PersistenceContext(unitName="mk-library")
    private EntityManager em;


    public Author create(Author author){
        em.persist(author);
        return author;
    }

    public void remove(Author author){
        em.remove(author);
        
    }

    public void remove(Long id){
        Author find = em.find(Author.class, id);
        em.remove(find);
    }

    public Author update(Author auth){
        // Any changes with entity will be updated in database automatically
        return auth;
    }

    public List<Author> getList(){
        List<Author> list = em.createQuery("SELECT author FROM Author author",Author.class).getResultList();
        return list;
    }

    public Author read(Long id){
        return em.find(Author.class, id);
    }

}

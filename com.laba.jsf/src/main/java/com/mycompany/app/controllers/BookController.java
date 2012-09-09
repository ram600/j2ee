/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.app.controllers;

import com.mycompany.app.entities.Author;
import com.mycompany.app.entities.Book;
import com.mycompany.app.logic.AuthorEJB;
import com.mycompany.app.logic.BookEJB;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author admin
 */
@ManagedBean
@SessionScoped
public class BookController {

    @EJB
    private BookEJB bookEJB;

    @EJB
    private AuthorEJB authorEJB;


    private Long bookId = null;

    private Book book = new Book();

    private Long selectedAuthorId = null;

    private List<Book> books = new ArrayList();
    private List<Author> authors = new ArrayList();


    @PostConstruct
    public void init(){
        FacesContext.getCurrentInstance().getExternalContext().log("PostConstruct: "+BookController.class);

        books = bookEJB.getList();
        authors = authorEJB.getList();
    }

    public String doIndex(){
        books = bookEJB.getList();
        return "index";
    }

    public String doCreate(){
        book.setAutor(authorEJB.read(selectedAuthorId));
        bookEJB.create(book);
        bookId = null;
        book = new Book();
        return doIndex();
    }

    public String doRead(){
        if(null != bookId){
            book = bookEJB.read(bookId);
        }
        authors = authorEJB.getList();
        return "book";
    }

    public String doRead(Long bookId){
        this.bookId = bookId;
        book = bookEJB.read(bookId);
        authors  = authorEJB.getList();
        return "book";
    }

    public String doUpdate(){
        book.setAutor(authorEJB.read(selectedAuthorId));
        bookEJB.update(book);
        bookId = null;
        book = null;
        return doIndex();

    }

    public String doDelete(){
        Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long bookId = Long.valueOf(params.get("bookId"));

        bookEJB.delete(bookId);
        return doIndex();
    }




}

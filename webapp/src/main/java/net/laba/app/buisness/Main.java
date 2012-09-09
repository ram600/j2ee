/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.buisness;


import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import net.laba.app.book.Book;

/**
 *
 * @author admin
 */
public class Main {


    @EJB
    private static BookEJBRemote bookEJB;

    public static void main(String[] args){

        try {
            Context ctx = new InitialContext();
            BookEJB bookEJB = (BookEJB)ctx.lookup("java:global/books/BookEJB!net.laba.app.buisness.BookEJB");
        } catch (Exception e) {
            System.out.print("Context EJB ERROR \n");
        }
       
       

        Book b = new Book("The Islands in Ocean");
        b.setIsbn("wwfgwg");
       

        bookEJB.createBook(b);

    }


}

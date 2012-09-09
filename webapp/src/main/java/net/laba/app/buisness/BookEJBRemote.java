/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.buisness;


import javax.ejb.Remote;
import net.laba.app.book.Book;

/**
 *
 * @author admin
 */
@Remote
public interface  BookEJBRemote {

    Book findBookById(Long id);
    Book createBook(Book book);

}

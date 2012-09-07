/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.laba.app.book;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;





 
@Entity
//@NamedQuery(name="findAllBooks",query="SELECT b FROM Book b")
public class Book implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private String title;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;

 
    public Book() {
    }

    public Book(String title) {
      this.title = title;
    }


   

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

  




}

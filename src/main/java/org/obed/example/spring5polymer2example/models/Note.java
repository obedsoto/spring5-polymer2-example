package org.obed.example.spring5polymer2example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by obed on 3/27/18.
 */

@Entity
public class Note implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String author;

    @Column
    private String content;

    @Column
    private Date creationDate;

    protected Note() {
        // Required by JPA
    }

    public Note(String author, String content, Date creationDate) {
        this.author = author;
        this.content = content;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

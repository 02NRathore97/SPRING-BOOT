package com.spring.springboot.api.book.bootrestbook.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

// @Entity
// @Table(name = "books")
// public class Book {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "book_id")
//     private int id;
//     private String title;

//     private String auther;

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getAuther() {
//         return auther;
//     }

//     public void setAuther(String auther) {
//         this.auther = auther;
//     }

//     public Book(int id, String title, String auther) {
//         this.id = id;
//         this.title = title;
//         this.auther = auther;
//     }

//     public Book() {
//     }

//     @Override
//     public String toString() {
//         return "Book [id=" + id + ", title=" + title + ", auther=" + auther + "]";
//     }
//
//}

//one to one mapping
// @Entity
// @Table(name = "books")
// public class Book {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "book_id")
//     private int id;
//     private String title;

//     @OneToOne(cascade = CascadeType.ALL)
//     private Auther auther;

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public Auther getAuther() {
//         return auther;
//     }

//     public void setAuther(Auther auther) {
//         this.auther = auther;
//     }

//     public Book(int id, String title, Auther auther) {
//         this.id = id;
//         this.title = title;
//         this.auther = auther;
//     }

//     public Book() {
//     }

//     @Override
//     public String toString() {
//         return "Book [id=" + id + ", title=" + title + ", auther=" + auther + "]";
//     }

//Bidirection
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private int id;
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Auther auther;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Auther getAuther() {
        return auther;
    }

    public void setAuther(Auther auther) {
        this.auther = auther;
    }

    public Book(int id, String title, Auther auther) {
        this.id = id;
        this.title = title;
        this.auther = auther;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", auther=" + auther + "]";
    }

}
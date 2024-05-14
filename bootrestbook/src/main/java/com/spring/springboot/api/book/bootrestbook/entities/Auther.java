package com.spring.springboot.api.book.bootrestbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

//Unidirection
// @Entity
// public class Auther {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "auther_id")
//     private int id;
//     private String firstName;
//     private String lastName;
//     private String language;

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getFirstName() {
//         return firstName;
//     }

//     public void setFirstName(String firstName) {
//         this.firstName = firstName;
//     }

//     public String getLastName() {
//         return lastName;
//     }

//     public void setLastName(String lastName) {
//         this.lastName = lastName;
//     }

//     public String getLanguage() {
//         return language;
//     }

//     public void setLanguage(String language) {
//         this.language = language;
//     }

//     public Auther(int id, String firstName, String lastName, String language) {
//         this.id = id;
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.language = language;
//     }

//     public Auther() {
//     }

//     @Override
//     public String toString() {
//         return "Auther [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", language=" + language
//                 + "]";
//     }

// }

//Bidirectional
@Entity
public class Auther {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auther_id")
    private int id;
    private String firstName;
    private String lastName;
    private String language;

    @OneToOne(mappedBy = "auther")
    @JsonBackReference
    private Book book;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLanguage() {
        return language;
    }

    public Book getBook() {
        return book;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Auther(int id, String firstName, String lastName, String language, Book book) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
        this.book = book;
    }

    public Auther() {
    }

    @Override
    public String toString() {
        return "Auther [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", language=" + language
                + ", book=" + book + "]";
    }

}

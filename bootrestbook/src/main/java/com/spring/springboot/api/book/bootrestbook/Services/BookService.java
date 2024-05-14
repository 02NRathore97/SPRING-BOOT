package com.spring.springboot.api.book.bootrestbook.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.springboot.api.book.bootrestbook.Dao.BookRepository;
import com.spring.springboot.api.book.bootrestbook.entities.Book;

@Component
public class BookService {
    // private static List<Book> list = new ArrayList<>();

    // static {
    // list.add(new Book(2, "php", "Vinod"));
    // list.add(new Book(3, "c", "Amit"));
    // list.add(new Book(4, "pythan", "Abhay"));
    // }

    // all book handler
    // public List<Book> getAllBooks() {
    // return list;
    // }

    // single book handler
    // public Book getBookById(int id) {
    // Book book = null;
    // try {
    // book = list.stream().filter(e -> e.getId() == id).findFirst().get();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // return book;
    // }

    // new book handler
    // public Book addBook(Book book) {
    // list.add(book);
    // return book;

    // }

    // delete book handler
    // public void deleteBook(int bookid) {
    // list.stream().filter(book -> {
    // if (book.getId() != bookid) {
    // return true;
    // } else {
    // return false;
    // }

    // }).collect(Collectors.toList());

    // list.stream().filter(book -> book.getId() !=
    // bookid).collect(Collectors.toList());
    // }

    // update book handler
    // public void updateBook(Book book, int bookid) {
    // list = list.stream().map(b -> {
    // if (b.getId() == bookid) {
    // b.setTitle(book.getTitle());
    // b.setAuther(book.getAuther());
    // }
    // return b;
    // }).collect(Collectors.toList());
    // }

    // ...........................................................................
    // connecting with database

    @Autowired
    private BookRepository bookRepository;

    // all book handler
    public List<Book> getAllBooks() {
        return (List<Book>) this.bookRepository.findAll();
    }

    // single book handler
    public Book getBookById(int id) {
        Book book = null;
        try {
            book = this.bookRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return book;
    }

    // new book handler
    public Book addBook(Book book) {
        Book result = bookRepository.save(book);
        return result;
    }

    // delete book handler
    public void deleteBook(int bookid) {
        bookRepository.deleteById(bookid);
    }

    // update book handler
    public void updateBook(Book book, int bookid) {
        book.setId(bookid);
        bookRepository.save(book);
    }
}

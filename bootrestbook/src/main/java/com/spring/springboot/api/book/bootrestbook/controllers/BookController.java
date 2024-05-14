package com.spring.springboot.api.book.bootrestbook.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springboot.api.book.bootrestbook.Services.BookService;
import com.spring.springboot.api.book.bootrestbook.entities.Book;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    // @GetMapping("/books")
    // public Book getBooks() {
    // Book book = new Book();
    // book.setId(1);
    // book.setTitle("Java");
    // book.setAuther("Neeraj");
    // return book;
    // }

    // ..........................................................................

    // All book handler
    // @GetMapping("/books")
    // public List getBooks() {

    // return this.bookService.getAllBooks();
    // }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {

        List<Book> list = bookService.getAllBooks();

        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    // ..........................................................................

    // Single book handler
    // @GetMapping("/books/{id}")
    // public Book getBook(@PathVariable("id") int id) {

    // return this.bookService.getBookById(id);
    // }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id) {

        Book book = bookService.getBookById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    // ..........................................................................
    // new book handler
    // @PostMapping("/books")
    // public Book addBook(@RequestBody Book book) {
    // Book b = this.bookService.addBook(book);
    // System.out.println(b);
    // return b;
    // }

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book b = null;
        try {
            b = this.bookService.addBook(book);
            System.out.println(b);
            return ResponseEntity.of(Optional.of(b));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // ..........................................................................
    // delete book handler
    // @DeleteMapping("/books/{bookid}")
    // public void deleteBook(@PathVariable("bookid") int bookid) {
    // this.bookService.deleteBook(bookid);

    // }

    @DeleteMapping("/books/{bookid}")
    public ResponseEntity<Object> deleteBook(@PathVariable("bookid") int bookid) {
        try {
            this.bookService.deleteBook(bookid);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    // ..........................................................................
    // update book handler
    // @PutMapping("/books/{bookid}")
    // public Book updateBook(@RequestBody Book book, @PathVariable("bookid") int
    // bookid) {
    // this.bookService.updateBook(book, bookid);
    // return book;
    // }

    @PutMapping("/books/{bookid}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookid") int bookid) {
        try {
            this.bookService.updateBook(book, bookid);
            return ResponseEntity.ok().build();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

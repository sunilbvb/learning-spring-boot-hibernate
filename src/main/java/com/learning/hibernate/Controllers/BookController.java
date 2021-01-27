package com.learning.hibernate.Controllers;

import java.util.Arrays;
import java.util.List;

import com.learning.hibernate.Models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> listAllBooks() {
        return Arrays.asList(new Book(1, "Java Headfirst", "Java guru"), new Book(2, "Java Headfirst", "Java guru"));
    }
}
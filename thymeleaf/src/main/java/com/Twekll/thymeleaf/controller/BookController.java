package com.Twekll.thymeleaf.controller;
import com.Twekll.thymeleaf.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {


    @GetMapping("/")
    public String getBooks(Model model) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Title 1", "Author 1"));
        books.add(new Book("Title 2", "Author 2"));
        books.add(new Book("Title 3", "Author 3"));

        model.addAttribute("books", books);
        return "book-list";
    }
}

package com.example.spring_mvc_library.controller;

import com.example.spring_mvc_library.model.Author;
import com.example.spring_mvc_library.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return authorService.findAll();
    }

    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }
}

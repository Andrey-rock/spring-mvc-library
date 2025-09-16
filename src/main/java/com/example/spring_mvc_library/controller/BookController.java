package com.example.spring_mvc_library.controller;

import com.example.spring_mvc_library.dto.BookDto;
import com.example.spring_mvc_library.dto.BookUp;
import com.example.spring_mvc_library.model.Book;
import com.example.spring_mvc_library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(Pageable page) {
        return bookService.findAll(page);
    }

    @GetMapping("book/{id}")
    public Book getBook(@PathVariable long id) {
        return bookService.findById(id);
    }


    @PostMapping("/create")
    public BookDto createBook(@RequestBody BookDto book) {
        return bookService.save(book);
    }

    @PutMapping("/update")
    public BookDto updateBook(@RequestBody BookUp book) {
        return bookService.update(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable long id) {
        bookService.deleteById(id);
    }
}

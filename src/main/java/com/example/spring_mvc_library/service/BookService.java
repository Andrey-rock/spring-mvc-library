package com.example.spring_mvc_library.service;

import com.example.spring_mvc_library.dto.BookDto;
import com.example.spring_mvc_library.dto.BookMapper;
import com.example.spring_mvc_library.dto.BookUp;
import com.example.spring_mvc_library.exception.NoSuchBookException;
import com.example.spring_mvc_library.model.Book;
import com.example.spring_mvc_library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;


    public List<Book> findAll(Pageable page) {

        return bookRepository.findAll(page).getContent();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(NoSuchBookException::new);
    }

    public BookDto save(BookDto book) {
        return bookMapper.toBookDto(bookRepository.save(bookMapper.toBook(book)));
    }

    public BookDto update(BookUp book) {
        return bookMapper.toBookDto(bookRepository.save(bookMapper.fromBookUp(book)));
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}

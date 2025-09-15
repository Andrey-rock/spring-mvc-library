package com.example.spring_mvc_library.service;

import com.example.spring_mvc_library.model.Author;
import com.example.spring_mvc_library.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<Author> findAll() {

        return authorRepository.findAll();
    }

    public Author addAuthor(Author author) {
        return authorRepository.save(author);

    }
}

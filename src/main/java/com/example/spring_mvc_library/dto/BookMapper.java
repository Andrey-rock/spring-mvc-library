package com.example.spring_mvc_library.dto;

import com.example.spring_mvc_library.model.Author;
import com.example.spring_mvc_library.model.Book;
import com.example.spring_mvc_library.repository.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    private final BookRepository bookRepository;

    public BookMapper(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book toBook(BookDto dto) {
        Book book = new Book();
        book.setAuthor(new Author(dto.getAuthor_id(), null, null));
        book.setTitle(dto.getTitle());
        book.setGenre(dto.getGenre());
        return book;
    }

    public BookDto toBookDto(Book book) {
        BookDto dto = new BookDto();
        dto.setAuthor_id(book.getAuthor().getId());
        dto.setTitle(book.getTitle());
        dto.setGenre(book.getGenre());
        return dto;
    }

    public Book fromBookUp (BookUp dto) {
        Book book1 = bookRepository.getReferenceById(dto.getId());
        book1.setTitle(dto.getTitle());
        book1.setGenre(dto.getGenre());
        return book1;
    }
}

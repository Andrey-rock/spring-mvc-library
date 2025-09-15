package com.example.spring_mvc_library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookUp {

    private long id;

    private String title;

    private String genre;

}

package com.learning.hibernate.Models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@ToString
public class Book {
    private int id;
    private String name;
    private String author;
}
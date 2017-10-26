package com.example.root.mvpbooks.repositories;

import com.example.root.mvpbooks.models.Book;

import java.util.List;

/**
 * Created by root on 26/10/17.
 */

public interface BooksRepository {
    List<Book> getBooks();
}

package com.example.root.mvpbooks;

import com.example.root.mvpbooks.models.Book;
import com.example.root.mvpbooks.repositories.BooksRepository;

import java.util.List;

/**
 * Created by root on 26/10/17.
 */

class BooksActivityPresenter {
    private BooksActivityView view;
    private BooksRepository booksRepository;


    public BooksActivityPresenter(BooksActivityView view, BooksRepository booksRepository) {

        this.view = view;
        this.booksRepository = booksRepository;
    }

    public void loadBooks() {
        List<Book> bookList = booksRepository.getBooks();
        view.displayBooks(bookList);
    }
}

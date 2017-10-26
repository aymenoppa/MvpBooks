package com.example.root.mvpbooks;

import com.example.root.mvpbooks.repositories.BooksRepository;

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
}

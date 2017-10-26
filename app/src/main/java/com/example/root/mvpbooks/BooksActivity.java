package com.example.root.mvpbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.root.mvpbooks.models.Book;

import java.util.List;

public class BooksActivity extends AppCompatActivity implements BooksActivityView {

    private BooksActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        presenter = new BooksActivityPresenter(this, null);
    }

    @Override
    public void displayBooks(List<Book> bookList) {

    }
}

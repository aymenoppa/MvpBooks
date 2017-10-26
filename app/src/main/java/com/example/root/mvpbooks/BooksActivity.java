package com.example.root.mvpbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BooksActivity extends AppCompatActivity implements BooksActivityView {

    private BooksActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        presenter = new BooksActivityPresenter(this);
    }
}

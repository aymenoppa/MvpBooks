package com.example.root.mvpbooks;

import com.example.root.mvpbooks.models.Book;
import com.example.root.mvpbooks.repositories.BooksRepository;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by root on 26/10/17.
 */
public class BooksActivityPresenterTest {
    @Test
    public void shouldpass()
    {
        Assert.assertEquals(1,1);
    }

    @Test
    public void ShouldPassBooksToView() {
        //given
        BooksActivityView view = new MockView();
        BooksRepository booksRepository = new MockBooksRepository();

        //when
        BooksActivityPresenter presenter = new BooksActivityPresenter(view, booksRepository);
        presenter.loadBooks();

        //then
        Assert.assertEquals(true, ((MockView) view).passed);


    }

    private class MockView implements BooksActivityView {

        boolean passed;

        @Override
        public void displayBooks(List<Book> bookList) {
            passed = true;
        }
    }

    private class MockBooksRepository implements BooksRepository {
        @Override
        public List<Book> getBooks() {

            return Arrays.asList(new Book(), new Book(), new Book());
        }
    }
}
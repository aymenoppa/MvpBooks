package com.example.root.mvpbooks;

import junit.framework.Assert;

import org.junit.Test;

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

        //when
        BooksActivityPresenter presenter = new BooksActivityPresenter(view);

        //then

    }

    private class MockView implements BooksActivityView {

    }
}
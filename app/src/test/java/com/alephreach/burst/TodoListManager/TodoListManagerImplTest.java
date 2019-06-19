package com.alephreach.burst.TodoListManager;

import com.alephreach.burst.screens.todolist.service.ItemListManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TodoListManagerImplTest {

    TodoListManager sut;
    Item stubItem_1;
    Item stubItem_2;

    @Before
    public void setUp() throws Exception {
        sut = new TodoListManagerImpl();
    }

    @Test
    public void atStart_shouldHaveZeroItemsInList(){
        Assert.assertThat(sut.getCount(), is(0));
    }

    @Test
    public void add_withOneItem_willIncreaseCountByOne(){
        sut.add(stubItem_1);
        Assert.assertThat(sut.getCount(), is(1));
    }

    @Test
    public void add_withTwoItem_willIncreaseCountByTwo() {
        sut.add(stubItem_1);
        sut.add(stubItem_2);
        Assert.assertThat(sut.getCount(), is(2));
    }

    @Test
    public void remove_withSizeOne_willReturnZero() {
        sut.add(stubItem_1);
        sut.remove(stubItem_1);
        Assert.assertThat(sut.getCount(), is(0));
    }

    @Test
    public void remove_withSizeTwo_willReturnOne(){
        sut.add(stubItem_1);
        sut.add(stubItem_2);
        sut.remove(stubItem_1);
        Assert.assertThat(sut.getCount(), is(1));
    }

    @Test
    public void get_oneItem_willreturnTheSameItem() {
        sut.add(stubItem_1);
        Assert.assertThat(sut.get(0), is(stubItem_1));
    }



}
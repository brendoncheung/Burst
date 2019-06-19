package com.alephreach.burst.TodoListManager;

import java.util.List;

public interface TodoListManager {

    void add(Item item);
    void remove(Item item);

    List<Item> getList();

    Item get(int index);
    int getCount();

}

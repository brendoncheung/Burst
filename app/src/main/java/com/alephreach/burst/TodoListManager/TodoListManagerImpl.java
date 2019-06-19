package com.alephreach.burst.TodoListManager;

import java.util.ArrayList;
import java.util.List;

class TodoListManagerImpl implements TodoListManager {

    private List<Item> items = new ArrayList<Item>();

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public List<Item> getList() {
        return items;
    }

    @Override
    public Item get(int index) {
        return items.get(index);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}

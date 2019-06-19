package com.alephreach.burst.persistence;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.alephreach.burst.TodoListManager.Item;

import java.util.List;

public interface ItemDao {

    @Query("SELECT * FROM item")
    List<Item> getAll();

    @Query("SELECT * FROM item ORDER BY date_created DESC")
    List<Item> getAllOrdered();

    @Delete
    void remove(Item item);

    @Insert
    void insert(Item item);
}

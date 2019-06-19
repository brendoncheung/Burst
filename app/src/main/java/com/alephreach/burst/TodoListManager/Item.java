package com.alephreach.burst.TodoListManager;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity
public class Item {

    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "title")
    public String title;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "priority")
    public String priority;

    @ColumnInfo(name = "is_checked")
    public boolean isChecked;

    @ColumnInfo(name = "date_created")
    public Date date;
}

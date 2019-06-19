package com.alephreach.burst.screens.todolist;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alephreach.burst.R;
import com.alephreach.burst.screens.common.BaseActivity;

public class TodoListActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_todolist);
    }
}

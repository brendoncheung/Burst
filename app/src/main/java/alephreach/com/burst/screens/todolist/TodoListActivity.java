package alephreach.com.burst.screens.todolist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;

import alephreach.com.burst.R;
import alephreach.com.burst.screens.common.BaseActivity;

public class TodoListActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_todolist);
    }
}

package alephreach.com.burst.screens.common;

import android.content.Context;
import android.content.Intent;

import alephreach.com.burst.screens.todolist.TodoListActivity;

public class ActivityScreenNavigator {

    private final Context mContext;

    public ActivityScreenNavigator(Context context) {
        mContext = context;
    }

    public void toToDoListActivity() {
        Intent intent = new Intent(mContext, TodoListActivity.class);
        mContext.startActivity(intent);
    }


}

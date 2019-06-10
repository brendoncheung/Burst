package alephreach.com.burst.screens.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ToggleButton;

public class ActivityScreenNavigator {

    private final Context mContext;

    public ActivityScreenNavigator(Context context) {
        mContext = context;
    }

    public void toToDoListActivity() {
        Intent intent = new Intent(mContext, ToggleButton.class);
    }


}

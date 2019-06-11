package alephreach.com.burst.screens.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import alephreach.com.burst.R;
import alephreach.com.burst.screens.common.BaseActivity;

public class LoginActivity extends BaseActivity {

    private LoginActivityController mController;
    private LoginActvitiyViewMvc mViewMvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mController = new LoginActivityController();
        mViewMvc = new LoginActvitiyViewMvcImpl(getLayoutInflater(), null);
        mController.bindView(mViewMvc);

        setContentView(mViewMvc.getRootView());


        // dependency injection will go here
    }

    @Override
    protected void onStart() {
        super.onStart();

        // onStart() will be determined by the detailed requirements of each specific Activity.
        mController.onStart();


    }

    @Override
    protected void onPause() {
        super.onPause();

        // In this method you should pause or stop on-screen animations and videos that you resumed or started in onResume().
        // Just like with onResume(), you hardly ever need to override onPause().

        // The reason why you handle animations in onPause() instead of onStop() is because when Activity
        // is partially hidden by e.g. system dialog or looses focus in multi-window mode, only onPause() will be called.
    }

    @Override
    protected void onStop() {
        super.onStop();

        mController.onStop();
    }
}

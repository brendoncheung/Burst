package alephreach.com.burst.screens.login;

import android.util.Log;
import android.widget.Toast;

import alephreach.com.burst.authentication.FetchUserLoginUseCase;
import alephreach.com.burst.screens.common.ActivityScreenNavigator;

public class LoginActivityController implements
        LoginActvitiyViewMvc.Listener,
        FetchUserLoginUseCase.Listener {

    private LoginActvitiyViewMvc mViewMvc;
    private FetchUserLoginUseCase mFetchUserLoginUseCase;
    private ActivityScreenNavigator mNavigator;

    public LoginActivityController() {
        mFetchUserLoginUseCase = new FetchUserLoginUseCase();
        mNavigator = new ActivityScreenNavigator(mViewMvc.getRootView().getContext());
    }

    public void bindView(LoginActvitiyViewMvc loginActvitiyViewMvc) {
        mViewMvc = loginActvitiyViewMvc;
    }

    public void onStart(){
        mViewMvc.registerListener(this);
        mFetchUserLoginUseCase.registerListener(this);
    }

    public void onStop() {
        mViewMvc.unregisterListener(this);
        mFetchUserLoginUseCase.unregisterListener(this);
    }

    @Override
    public void onLoginButtonClicked() {
        mFetchUserLoginUseCase.fetchUserProfileAndNotify();
        Log.d("Login", mViewMvc.getViewState().get(LoginActvitiyViewMvcImpl.USERNAME).toString());
        Log.d("Login", mViewMvc.getViewState().get(LoginActvitiyViewMvcImpl.PASSWORD).toString());
    }


    @Override
    public void onSuccessUserLogin() {
        // transition to next activity
        mNavigator.toToDoListActivity();
        Log.d("login", "success");
    }

    @Override
    public void onFailureUserLogin() {

    }
}

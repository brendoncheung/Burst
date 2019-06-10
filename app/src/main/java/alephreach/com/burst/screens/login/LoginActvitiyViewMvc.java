package alephreach.com.burst.screens.login;

import android.os.Bundle;

import alephreach.com.burst.screens.common.views.ObservableViewMvc;

public interface LoginActvitiyViewMvc extends ObservableViewMvc<LoginActvitiyViewMvc.Listener> {

    interface Listener {
        void onLoginButtonClicked();
    }

    Bundle getViewState();

}

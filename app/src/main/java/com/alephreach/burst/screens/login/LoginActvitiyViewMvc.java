package com.alephreach.burst.screens.login;

import android.os.Bundle;

import com.alephreach.burst.screens.common.views.ObservableViewMvc;

public interface LoginActvitiyViewMvc extends ObservableViewMvc<LoginActvitiyViewMvc.Listener> {

    interface Listener {
        void onLoginButtonClicked();
    }

    Bundle getViewState();

}

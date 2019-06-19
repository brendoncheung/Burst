package com.alephreach.burst.authentication;

import com.alephreach.burst.screens.common.views.BaseObservableViewMvc;

public class FetchUserLoginUseCase extends BaseObservableViewMvc<FetchUserLoginUseCase.Listener> {

    public interface Listener {
        void onSuccessUserLogin();
        void onFailureUserLogin();
    }


    public void fetchUserProfileAndNotify() {

        // stub

        for(Listener listener : getListeners()) {
            listener.onSuccessUserLogin();
        }
    }
}

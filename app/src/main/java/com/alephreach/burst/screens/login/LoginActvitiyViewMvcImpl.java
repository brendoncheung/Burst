package com.alephreach.burst.screens.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.alephreach.burst.R;
import com.alephreach.burst.screens.common.views.BaseObservableViewMvc;

class LoginActvitiyViewMvcImpl extends BaseObservableViewMvc<LoginActvitiyViewMvc.Listener> implements LoginActvitiyViewMvc {

    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";

    private EditText mUserEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;

    public LoginActvitiyViewMvcImpl(final LayoutInflater layoutInflater, ViewGroup parent) {
        setRootView(layoutInflater.inflate(R.layout.activity_login, parent, false));
        mUserEditText = findViewById(R.id.activity_login_username_edittext);
        mPasswordEditText = findViewById(R.id.activity_login_password_edittext);
        mLoginButton = findViewById(R.id.activity_login_login_button);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(Listener listener : getListeners()) {
                    listener.onLoginButtonClicked();
                }
            }
        });
    }

    @Override
    public Bundle getViewState() {
        Bundle bundle = new Bundle();
        bundle.putString(USERNAME, mUserEditText.getText().toString());
        bundle.putString(PASSWORD, mPasswordEditText.getText().toString());
        return bundle;
    }
}

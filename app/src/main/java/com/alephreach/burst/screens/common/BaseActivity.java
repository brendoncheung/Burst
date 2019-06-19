package com.alephreach.burst.screens.common;

import android.support.v7.app.AppCompatActivity;

import com.alephreach.burst.common.dependencyinjection.ControllerCompositionRoot;

public class BaseActivity extends AppCompatActivity {

    private ControllerCompositionRoot mControllerCompRoot;

    protected ControllerCompositionRoot getControllerCompositionRoot() {
        if (mControllerCompRoot == null) {
            mControllerCompRoot = new ControllerCompositionRoot(this);
        }

        return mControllerCompRoot;
    }

}

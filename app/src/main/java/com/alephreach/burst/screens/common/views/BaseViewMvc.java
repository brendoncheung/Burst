package com.alephreach.burst.screens.common.views;

import android.content.Context;
import android.view.View;

public abstract class BaseViewMvc implements ViewMvc {

    private View mRootView;

    @Override
    public void setRootView(View view) {
        this.mRootView = view;
    }

    @Override
    public View getRootView() {
        return mRootView;
    }

    protected <T extends View> T findViewById(int id) {
        return mRootView.findViewById(id);
    }

    protected Context getContext() {
        return getRootView().getContext();
    }
}



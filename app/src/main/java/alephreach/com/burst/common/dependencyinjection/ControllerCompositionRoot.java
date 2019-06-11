package alephreach.com.burst.common.dependencyinjection;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

import alephreach.com.burst.screens.common.ActivityScreenNavigator;

public class ControllerCompositionRoot {


    private final FragmentActivity mActivity;

    public ControllerCompositionRoot(FragmentActivity fragmentActivity) {
        mActivity = fragmentActivity;
    }

    private Context getContext() {
        return mActivity;
    }

    private Activity getActivity() {
        return mActivity;
    }

    private ActivityScreenNavigator getActivityScreenNavigator() {
        return new ActivityScreenNavigator(getContext());
    }

}

package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    private static final String APP_PACKAGE_NAME = "com.udacity.builditbigger";
    private static final String FREE_PACKAGE_NAME = APP_PACKAGE_NAME.concat(".flavors.free.free");
    private static final String PAID_PACKAGE_NAME = APP_PACKAGE_NAME.concat(".flavors.paid.paid");
    private static final String FREE_FLAVOR = "free";
    private static final String PAID_FLAVOR = "paid";

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Log.v("PKG" , appContext.getOpPackageName());
        if(BuildConfig.FLAVOR.equals(PAID_FLAVOR))
            assertEquals(PAID_PACKAGE_NAME, appContext.getPackageName());
        else if(BuildConfig.FLAVOR.equals(FREE_FLAVOR))
            assertEquals(FREE_PACKAGE_NAME, appContext.getPackageName());
    }

    @Test
    public void testAsyncTaskJoke() throws Exception {
        EndpointsAsyncTask testAsyncTask = new EndpointsAsyncTask(activityTestRule.getActivity());
        testAsyncTask.execute();
        String result = testAsyncTask.get();
        assertFalse(TextUtils.isEmpty(result));
    }

}
